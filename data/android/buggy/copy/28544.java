@java.lang.Override
public void onStop() {
    super.onStop();
    AppIndex.AppIndexApi.end(client, getIndexApiAction());
    client.disconnect();
}