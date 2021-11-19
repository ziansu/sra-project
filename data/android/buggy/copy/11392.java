private void changeText(java.lang.String string) {
    try {
        simonAlam.SimonScreenAlam.label.setText(string);
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}