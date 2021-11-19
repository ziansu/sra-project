@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (!(showToast))
        return ;
    
    android.widget.Toast.makeText(getApplication(), result, Toast.LENGTH_SHORT).show();
}