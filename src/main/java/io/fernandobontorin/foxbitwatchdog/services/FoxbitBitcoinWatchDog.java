package io.fernandobontorin.foxbitwatchdog.services;

import io.fernandobontorin.foxbitwatchdog.data.dto.Currency;
import io.fernandobontorin.foxbitwatchdog.data.repository.OnlineDataStore;
import io.fernandobontorin.foxbitwatchdog.services.foxbit.FoxbitEndpoint;
import io.fernandobontorin.foxbitwatchdog.services.foxbit.msg.plugnplay.SubscribeBitcoin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxbitBitcoinWatchDog implements BitcoinWatchDog {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final FoxbitEndpoint fe;
    private final OnlineDataStore db;

    @Autowired
    public FoxbitBitcoinWatchDog(FoxbitEndpoint fe, OnlineDataStore db) {
        this.fe = fe;
        this.db = db;
        fe.connect();
        fe.message(new SubscribeBitcoin());
    }

    @Override
    public Currency getBitcoinCurrency() {
        return db.getBitcoin();
    }
}
