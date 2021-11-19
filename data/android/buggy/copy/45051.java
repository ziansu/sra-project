@org.junit.BeforeClass
public static void setUp() {
    org.ros2.rcljava.examples.test.SimpleTest.logger.setLevel(java.util.logging.Level.ALL);
    java.util.logging.ConsoleHandler handler = new java.util.logging.ConsoleHandler();
    handler.setFormatter(new java.util.logging.SimpleFormatter());
    org.ros2.rcljava.examples.test.SimpleTest.logger.addHandler(handler);
    handler.setLevel(java.util.logging.Level.ALL);
}