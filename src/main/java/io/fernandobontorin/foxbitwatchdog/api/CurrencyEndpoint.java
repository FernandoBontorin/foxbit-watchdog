package io.fernandobontorin.foxbitwatchdog.api;

import io.fernandobontorin.foxbitwatchdog.data.dto.Currency;
import io.fernandobontorin.foxbitwatchdog.services.BitcoinWatchDog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyEndpoint {

    @Autowired
    BitcoinWatchDog watchDog;

    @GetMapping(value = "/bitcoin")
    public Currency getBitcoin() {
        return watchDog.getBitcoinCurrency();
    }

    @GetMapping(value = "/bitcoin/value")
    public Double getBitcoinValue() {
        return watchDog.getBitcoinCurrency().getLastTradedPx();
    }

}
