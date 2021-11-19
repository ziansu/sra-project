@org.junit.Before
public void setup() {
    mvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
}