private void startInterceptor() {
    android.content.Intent vpnIntent = android.net.VpnService.prepare(this);
    if (vpnIntent != null)
        startActivityForResult(vpnIntent, com.juliansparber.vpnMITM.InterceptorActivity.VPN_REQUEST_CODE);
    else
        onActivityResult(com.juliansparber.vpnMITM.InterceptorActivity.VPN_REQUEST_CODE, com.juliansparber.vpnMITM.RESULT_OK, null);
    
}