@org.junit.Test
public void testValues() {
    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> map = createResizedDS();
    java.util.Collection<java.lang.Integer> values = map.values();
    org.junit.Assert.assertNotEquals("You are likely running an unchanged JVM", "{0, 2, 3, 4, 5, 6, 7, 8, 9}", values.toString());
}