@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... urls) {
    android.util.Log.d("Rest", "doinbackground");
    java.lang.String response = "";
    for (java.lang.String url : urls) {
        response = edu.ubbcluj.canvasAndroid.backend.repository.restApi.RestInformationDAO.putData(url);
    }
    return response;
}