protected void onPostExecute(java.lang.Boolean result) {
    if (result)
        if (adminChose)
            new com.myApplication.yosef.finalproject.AdminChooseSeries.sendActiveSerie().execute();
        else
            android.widget.Toast.makeText(this, "Cant set game to be active", Toast.LENGTH_LONG).show();
        
    
}