package io.fernandobontorin.foxbitwatchdog.data.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.fernandobontorin.foxbitwatchdog.data.dto.Currency;
import io.fernandobontorin.foxbitwatchdog.services.foxbit.msg.MessageFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class OnlineDataStore {
    private final ObjectMapper mapper;
    private final Currency EMPTY_CURRENCY;
    private final MessageFrame EMPTY_FRAME;
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private Currency bitcoin;

    public OnlineDataStore() {
        bitcoin = new Currency();
        mapper = new ObjectMapper();
        EMPTY_CURRENCY = new Currency();
        EMPTY_FRAME = new MessageFrame();
    }

    public synchronized Currency getBitcoin() {
        return bitcoin;
    }

    public synchronized void setBitcoin(Currency bitcoin) {
        this.bitcoin = bitcoin;
    }

    public void setBitcoin(String currency) {
        Currency value = EMPTY_CURRENCY;
        try {
            value = mapper.readValue(currency, Currency.class);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
        }
        setBitcoin(value);
    }

    public void setBitcoinByFrame(String frame) {
        MessageFrame value = EMPTY_FRAME;
        try {
            value = mapper.readValue(frame, MessageFrame.class);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage());
        }
        setBitcoin(value.getO());
    }
}
