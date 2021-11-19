@java.lang.Override
public void callback(java.util.List<java.lang.Character> response) {
    try {
        assertEquals(list, response);
        finishTest();
    } catch (java.lang.Throwable e) {
        e.printStackTrace();
        fail();
    }
}