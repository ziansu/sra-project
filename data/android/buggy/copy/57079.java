@org.junit.Before
public void setup() {
    mvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(context).alwaysDo(org.springframework.test.web.servlet.result.MockMvcResultHandlers.print()).apply(org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity()).build();
}