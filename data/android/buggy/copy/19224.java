@org.junit.BeforeClass
public static void init() {
    java.lang.System.setProperty("hawkular.data", "./target/ispn");
    alerts = new org.hawkular.alerts.engine.impl.ispn.IspnAlertsServiceImpl();
    alerts.init();
}