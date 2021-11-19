@org.junit.Test
public void rbudpTest() throws java.lang.Exception {
    cz.muni.fi.rbudp.receiver.RBUDPReceiver.getInstance().start(9250, "C:\\Java\\reliable-blast-udp4j\\target");
    java.lang.Thread.sleep(100);
    new cz.muni.fi.rbudp.sender.RBUDPSender("localhost", 9250, "C:\\Java\\reliable-blast-udp4j\\src\\test\\resources\\log.log").send();
}