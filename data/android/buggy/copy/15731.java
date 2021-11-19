@org.junit.Test
public void testNameLarge() throws java.lang.Exception {
    webhook = webhook.withDefaults(true);
    webhookValidator.validate(webhook.withName(com.google.common.base.Strings.repeat("B", 128)));
}