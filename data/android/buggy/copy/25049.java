@java.lang.Override
public void registerClient(client.ClientRemote client) throws java.rmi.RemoteException {
    server.Server.clients.add(client);
    java.lang.System.out.println("Register new client");
    java.lang.System.out.println(server.Server.clients);
}