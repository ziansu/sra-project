@java.lang.Override
public void onClientLostRoute(client.Client client, client.Client route) {
    java.lang.System.out.println("Lost Route!");
    removeUser(client.getName());
}