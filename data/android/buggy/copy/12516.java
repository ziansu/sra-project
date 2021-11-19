public void done(java.lang.Boolean result, com.parse.ParseException e) {
    if (e == null) {
        android.util.Log.i("Results :", result.toString());
    }else {
        android.util.Log.i("Error", e.getMessage());
    }
}