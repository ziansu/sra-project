@org.junit.Test
public void test_split_path_no_components() {
    java.lang.String[] result = com.afollestad.ason.Util.splitPath("Hello!");
    org.junit.Assert.assertEquals(1, result.length);
}