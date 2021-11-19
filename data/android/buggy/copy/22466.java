public void onClick(android.view.View v) {
    dbHandler.deleteItem(buttonName);
    android.util.Log.d("android:HELP", buttonName);
    linearLayout.removeView(button);
}