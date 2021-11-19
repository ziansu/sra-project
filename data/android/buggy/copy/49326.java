@org.junit.Before
public void setUp() {
    tradeParams[0] = nAmount;
    tradeParams[1] = dStopDist;
    brokerBuy = new com.jforex.dzjforex.brokerapi.BrokerBuy(orderSubmitMock, orderMergeMock, tradeUtilMock);
}