package io.fernandobontorin.foxbitwatchdog.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Currency {
    long omsId, instrumentId, lastTradeTime, rolling24NumTrades, timeStamp;
    String bestBid, bestOffer;
    Double lastTradedPx, lastTradedQty, sessionOpen, sessionHigh, sessionLow, sessionClose, volume, currentDayVolume, currentDayNumTrades, currentDayPxChange, rolling24HrVolume, rolling24HrPxChange;

    public Currency() {
    }

    public long getOmsId() {
        return omsId;
    }

    @JsonProperty("OMSId")
    public void setOmsId(long omsId) {
        this.omsId = omsId;
    }

    public long getInstrumentId() {
        return instrumentId;
    }

    @JsonProperty("InstrumentId")
    public void setInstrumentId(long instrumentId) {
        this.instrumentId = instrumentId;
    }

    public long getLastTradeTime() {
        return lastTradeTime;
    }

    @JsonProperty("LastTradeTime")
    public void setLastTradeTime(long lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public long getRolling24NumTrades() {
        return rolling24NumTrades;
    }

    @JsonProperty("Rolling24NumTrades")
    public void setRolling24NumTrades(long rolling24NumTrades) {
        this.rolling24NumTrades = rolling24NumTrades;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    @JsonProperty("TimeStamp")
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getBestBid() {
        return bestBid;
    }

    @JsonProperty("BestBid")
    public void setBestBid(String bestBid) {
        this.bestBid = bestBid;
    }

    public String getBestOffer() {
        return bestOffer;
    }

    @JsonProperty("BestOffer")
    public void setBestOffer(String bestOffer) {
        this.bestOffer = bestOffer;
    }

    public Double getLastTradedPx() {
        return lastTradedPx;
    }

    @JsonProperty("LastTradedPx")
    public void setLastTradedPx(Double lastTradedPx) {
        this.lastTradedPx = lastTradedPx;
    }

    public Double getLastTradedQty() {
        return lastTradedQty;
    }

    @JsonProperty("LastTradedQty")
    public void setLastTradedQty(Double lastTradedQty) {
        this.lastTradedQty = lastTradedQty;
    }

    public Double getSessionOpen() {
        return sessionOpen;
    }

    @JsonProperty("SessionOpen")
    public void setSessionOpen(Double sessionOpen) {
        this.sessionOpen = sessionOpen;
    }

    public Double getSessionHigh() {
        return sessionHigh;
    }

    @JsonProperty("SessionHigh")
    public void setSessionHigh(Double sessionHigh) {
        this.sessionHigh = sessionHigh;
    }

    public Double getSessionLow() {
        return sessionLow;
    }

    @JsonProperty("SessionLow")
    public void setSessionLow(Double sessionLow) {
        this.sessionLow = sessionLow;
    }

    public Double getSessionClose() {
        return sessionClose;
    }

    @JsonProperty("SessionClose")
    public void setSessionClose(Double sessionClose) {
        this.sessionClose = sessionClose;
    }

    public Double getVolume() {
        return volume;
    }

    @JsonProperty("Volume")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getCurrentDayVolume() {
        return currentDayVolume;
    }

    @JsonProperty("CurrentDayVolume")
    public void setCurrentDayVolume(Double currentDayVolume) {
        this.currentDayVolume = currentDayVolume;
    }

    public Double getCurrentDayNumTrades() {
        return currentDayNumTrades;
    }

    @JsonProperty("CurrentDayNumTrades")
    public void setCurrentDayNumTrades(Double currentDayNumTrades) {
        this.currentDayNumTrades = currentDayNumTrades;
    }

    public Double getCurrentDayPxChange() {
        return currentDayPxChange;
    }

    @JsonProperty("CurrentDayPxChange")
    public void setCurrentDayPxChange(Double currentDayPxChange) {
        this.currentDayPxChange = currentDayPxChange;
    }

    public Double getRolling24HrVolume() {
        return rolling24HrVolume;
    }

    @JsonProperty("Rolling24HrVolume")
    public void setRolling24HrVolume(Double rolling24HrVolume) {
        this.rolling24HrVolume = rolling24HrVolume;
    }

    public Double getRolling24HrPxChange() {
        return rolling24HrPxChange;
    }

    @JsonProperty("Rolling24HrPxChange")
    public void setRolling24HrPxChange(Double rolling24HrPxChange) {
        this.rolling24HrPxChange = rolling24HrPxChange;
    }
}
