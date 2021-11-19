public void testApp() {
    nl.blueside.sp_api.App app = new nl.blueside.sp_api.App();
    java.lang.String str = app.prepareString("omg");
    java.lang.String str = app.prepareString(1);
    assertEquals("_omg", str);
}