@org.junit.Test
public void pageFoundTest() throws java.lang.Exception {
    mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/admin/products")).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk());
}