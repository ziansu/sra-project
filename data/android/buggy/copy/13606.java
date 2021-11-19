protected boolean checkInternetConnectivity() {
    if (!(com.thetidbitapp.util.InternetUtil.isOnline(mContext))) {
        android.widget.Toast.makeText(mContext, "Stahp, no internet.", Toast.LENGTH_LONG).show();
        return false;
    }
    return true;
}