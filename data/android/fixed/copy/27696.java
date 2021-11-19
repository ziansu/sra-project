@org.junit.Before
public void setUp() {
    this.mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(this.context).apply(documentationConfiguration(this.restDocumentation)).build();
}