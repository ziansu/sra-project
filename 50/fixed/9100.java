@org.junit.Test
@org.springframework.transaction.annotation.Transactional
public void getNonExistingPoints() throws java.lang.Exception {
    restPointsMockMvc.perform(get("/api/points/{id}", java.lang.Long.MAX_VALUE)).andExpect(status().isNotFound());
}