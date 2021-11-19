public void onClick(android.view.View v) {
    (gearNum)--;
    android.util.Log.d(TAG, ("Gears = " + (gearNum)));
    txt_GearsPlaced.setText(java.lang.Integer.toString(gearNum));
}