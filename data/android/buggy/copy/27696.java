@org.junit.Before
public void setUp() {
    this.mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(this.context).apply(org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.documentationConfiguration(this.restDocumentation)).build();
}