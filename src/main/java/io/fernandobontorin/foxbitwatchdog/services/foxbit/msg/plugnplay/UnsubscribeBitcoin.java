package io.fernandobontorin.foxbitwatchdog.services.foxbit.msg.plugnplay;

import io.fernandobontorin.foxbitwatchdog.services.foxbit.TopicIncremental;
import io.fernandobontorin.foxbitwatchdog.services.foxbit.msg.MessageFrame;
import io.fernandobontorin.foxbitwatchdog.services.foxbit.msg.MessageType;

public class UnsubscribeBitcoin extends MessageFrame {
    public UnsubscribeBitcoin() {
        super(MessageType.Request.getId(), TopicIncremental.getInstance().next(), "UnsubscribeLevel1", "{\"OMSId\":1,\"InstrumentId\":1}");
    }
}
