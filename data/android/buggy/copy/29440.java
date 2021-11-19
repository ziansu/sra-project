@org.junit.Test
public void testNoLocale() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/index.page").locale(null)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk());
}