@org.junit.Test
public void testMappings() throws java.lang.Exception {
    org.springframework.mock.web.MockHttpServletRequest request = new org.springframework.mock.web.MockHttpServletRequest();
    xmlConfigSetup("classpath:mvc-test.xml").build();
}