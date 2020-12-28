package io.fernandobontorin.foxbitwatchdog.services.foxbit.msg;

public enum MessageType {
    Request(0), Reply(1), Subscribe(2), Event(3), Unsubscribe(4);

    private final Integer id;

    MessageType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
