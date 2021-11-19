@java.lang.Override
public void registerClient(io.apiman.gateway.engine.beans.Client client) {
    java.lang.System.out.println("Register client");
    super.registerClient(client, emptyHandler);
}