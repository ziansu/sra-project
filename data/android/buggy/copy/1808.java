private void stopInterceptor() {
    if (xyz.hexene.localvpn.LocalVPNService.isRunning()) {
        android.content.Intent stopIntent = new android.content.Intent(this, xyz.hexene.localvpn.LocalVPNService.class);
        stopIntent.putExtra("cmd", "stop");
        startService(stopIntent);
    }
}