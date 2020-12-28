package io.fernandobontorin.foxbitwatchdog.services.foxbit;

public class TopicIncremental {

    private static TopicIncremental instance;
    private Long value;

    private TopicIncremental() {
        value = 0L;
    }

    public static TopicIncremental getInstance() {
        if (instance == null)
            instance = new TopicIncremental();
        return instance;
    }

    public Long next() {
        return ++value;
    }

    public Long next(Long n){
        this.value = n;
        return next();
    }
}
