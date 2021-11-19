@org.junit.Test
public void testInit() {
    fr.tbr.junit.tests.TestLog4J2Configuration.logger.debug("test debug");
    fr.tbr.junit.tests.TestLog4J2Configuration.logger.info("test info");
    fr.tbr.junit.tests.TestLog4J2Configuration.logger.trace("low level");
    fr.tbr.junit.tests.TestLog4J2Configuration.logger.error("error test");
    fr.tbr.junit.tests.TestLog4J2Configuration.logger.de = $missing$;
}