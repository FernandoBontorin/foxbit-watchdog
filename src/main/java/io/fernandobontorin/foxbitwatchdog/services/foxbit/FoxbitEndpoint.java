package io.fernandobontorin.foxbitwatchdog.services.foxbit;


import io.fernandobontorin.foxbitwatchdog.data.repository.OnlineDataStore;
import io.fernandobontorin.foxbitwatchdog.services.foxbit.msg.MessageFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@Component
@ClientEndpoint
public class FoxbitEndpoint extends Endpoint {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final String WS_API = "wss://api.foxbit.com.br";
    private Session session;
    @Autowired
    private OnlineDataStore db;

    public void connect() {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        ClientEndpointConfig config = ClientEndpointConfig.Builder.create().build();
        try {
            this.session = container.connectToServer(this, config, new URI(WS_API));
        } catch (DeploymentException | IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        session.addMessageHandler(new MessageHandler.Whole<String>() {
            @Override
            public void onMessage(String frame) {
                db.setBitcoinByFrame(frame);
            }
        });
    }

    public void message(MessageFrame message) {
        session.getAsyncRemote().sendText(message.toString());
    }

}
