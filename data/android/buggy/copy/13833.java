@java.lang.Override
public void match(org.springframework.test.web.servlet.MvcResult result) {
    org.springframework.test.util.AssertionErrors.assertEquals(("Response header " + name), result.getResponse().getHeader(name), value);
}