@java.lang.Override
protected void onPostExecute(com.google.api.client.googleapis.extensions.android.gms.auth.UserRecoverableAuthIOException exception) {
    if (exception == null)
        return ;
    
    android.content.Intent intent = exception.getIntent();
    this.startActivityForResult(intent, com.tylerrockwood.software.cam2pdf.MainActivity.REQUEST_AUTHORIZATION);
}