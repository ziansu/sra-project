public void onClick(android.view.View view) {
    java.lang.Thread thread = new java.lang.Thread(mutiThread);
    thread.start();
    try {
        startActivity(intent);
    } catch (java.lang.Exception e) {
        text.setText(e.toString());
    }
}