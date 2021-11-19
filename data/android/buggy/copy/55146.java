protected void onPause() {
    super.onPause();
    mSensorManager.unregisterListener(this);
    try {
        writer.close();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}