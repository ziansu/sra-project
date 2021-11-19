@org.junit.Test
public void testSendTestMail() throws java.lang.Exception {
    loginSysAdmin();
    org.thingsboard.server.common.data.AdminSettings adminSettings = doGet("/api/admin/settings/mail", org.thingsboard.server.common.data.AdminSettings.class);
    doPost("/api/admin/settings/testMail", adminSettings).andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk());
}