@java.lang.Override
protected void onStop() {
    super.onStop();
    syncServiceClient.unbind();
    if ((googlePlusClient) != null)
        googlePlusClient.disconnect();
    
}