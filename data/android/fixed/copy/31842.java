@java.lang.Override
protected void onPostExecute(java.lang.String[] result) {
    if (result != null)
        android.util.Log.v(LOG_TAG, ("Uber total fare is: " + (result[0])));
    
}