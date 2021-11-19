public void testEmptyArray() {
    java.util.ArrayList<java.lang.Integer> array = new java.util.ArrayList<>();
    assertFalse(new com.mycompany.app.App().search(array, 1, 3));
}