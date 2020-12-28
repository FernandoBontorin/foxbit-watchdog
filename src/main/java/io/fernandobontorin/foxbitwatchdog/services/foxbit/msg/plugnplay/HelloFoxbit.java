package io.fernandobontorin.foxbitwatchdog.services.foxbit.msg.plugnplay;

import io.fernandobontorin.foxbitwatchdog.services.foxbit.TopicIncremental;
import io.fernandobontorin.foxbitwatchdog.services.foxbit.msg.MessageFrame;
import io.fernandobontorin.foxbitwatchdog.services.foxbit.msg.MessageType;

public class HelloFoxbit extends MessageFrame {
    public HelloFoxbit() {
        super(MessageType.Request.getId(), TopicIncremental.getInstance().next(), "GetOMSs", "{\"OperatorId\":1}");
    }
}
