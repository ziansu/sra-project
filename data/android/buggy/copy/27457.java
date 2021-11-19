@java.lang.Override
public void onSuccess(java.lang.Boolean wasSuccessful) {
    if (wasSuccessful) {
        org.jboss.as.console.client.Console.info(("Successfully modified server-config " + name));
    }else {
        org.jboss.as.console.client.Console.error(("Failed to modify server-config " + name));
    }
    loadServerConfigurations();
}