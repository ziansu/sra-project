@org.junit.Before
public void setUp() {
    this.request = new org.springframework.mock.web.test.MockHttpServletRequest();
    org.springframework.web.context.request.RequestContextHolder.setRequestAttributes(new org.springframework.web.context.request.ServletRequestAttributes(this.request));
}