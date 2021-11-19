@java.lang.Override
public void onFailure(java.lang.Throwable caught) {
    org.jboss.as.console.client.Console.error(("Failed to modify server-config " + name));
    loadServerConfigurations();
}