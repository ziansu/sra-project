@java.lang.Override
public void onStart() {
    super.onStart();
    client.connect();
    AppIndex.AppIndexApi.start(client, getIndexApiAction());
}