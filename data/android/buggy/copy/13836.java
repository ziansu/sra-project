public void checkNextDialog(java.lang.String key) {
    java.lang.System.out.println(dials());
    org.junit.Assert.assertEquals(key, zildo.fwk.ZUtils.listTail(dials()).key);
}