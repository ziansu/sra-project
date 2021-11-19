public void testHeadline1() {
    HeadlineFormatter headlineFormatter = new HeadlineFormatter();
    java.lang.String result = headlineFormatter.getCleanString("and or");
    assertEquals("", result);
}