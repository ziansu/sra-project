public void tellJoke(android.view.View view) {
    android.widget.Toast.makeText(this, "derp", Toast.LENGTH_SHORT).show();
    new com.shentuo.builditbigger.EndpointsAsyncTask().execute(new android.util.Pair<android.content.Context, java.lang.String>(this, "Testing from BuildItBigger"));
}