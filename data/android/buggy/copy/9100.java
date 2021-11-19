@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void getNonExistingPoints() throws java.lang.Exception {
    restPointsMockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get("/api/points/{id}", java.lang.Long.MAX_VALUE)).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isNotFound());
}