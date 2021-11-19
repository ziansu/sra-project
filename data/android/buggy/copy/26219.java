public void increment(android.view.View view) {
    android.util.Log.d("CounterFrag", "Incremented Count");
    ++(count);
    updateFieldFromCount();
}