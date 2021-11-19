public void testNotFound() {
    java.util.ArrayList<java.lang.Integer> array = new java.util.ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4));
    assertFalse(new com.mycompany.app.App().search(array, 5, 0));
}