@org.junit.Before
private void setMvc() {
    mvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(context).build();
    contactService.evictCache();
}