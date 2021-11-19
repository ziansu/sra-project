@org.junit.Before
public void setUp() throws java.lang.Exception {
    sender = new utils.ts.mail.DelegatingMailSender(mailConfigProvider, java.util.Arrays.asList(defaultMailSender, secondaryMailSender));
}