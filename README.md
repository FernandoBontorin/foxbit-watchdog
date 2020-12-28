# foxbit-watchdog
Is application to watch bitcoin fall and do something

## Introduction
Put a watchdog to protect the value of your bitcoins:

From source:
```bash
gradle bootJar
```

## Roadmap
- [x] interact with Foxbit WebSocket Service
- [x] get Bitcoin latest sell value
- [x] build container
- [x] enable sonarqube stats
- [ ] service status endpoint
- [ ] improve data convertion*
- [ ] improve class functions*
- [ ] improve data store*
- [ ] interact login
- [ ] login
- [ ] interact trade
- [ ] trade bitcoins on trigger rules
- [ ] create rules logic
- [ ] configure rules and account remote
- [ ] session start token (enable safely remote configuration)

###### * are not mandatory

## Endpoints
GET /bitcoin
- returns stats of bitcoin transactions
```json
{"OMSId":1,"InstrumentId":1,"LastTradeTime":1609151123,"Rolling24NumTrades":4500,"TimeStamp":1609151248,"BestBid":"141312.0","BestOffer":"141791.999","LastTradedPx":141814.61,"LastTradedQty":0.00705145,"SessionOpen":147975.89,"SessionHigh":144499.9999,"SessionLow":135100.0001,"SessionClose":141851.34,"Volume":0.00705145,"CurrentDayVolume":41.2985,"CurrentDayNumTrades":2003.0,"CurrentDayPxChange":-147.97,"Rolling24HrVolume":100.247,"Rolling24HrPxChange":-4.1389}
```
GET /bitcoin/value
- returns latest bitcoin transaction value in BRL
```json
141814.61
```