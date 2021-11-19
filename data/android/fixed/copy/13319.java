@java.lang.Override
protected void onPostExecute(com.guster.skywebservice.library.webservice.Response response) {
    if ((callback) != null)
        callback.onResponse(response, ((response != null) && (response.success())), args);
    
}