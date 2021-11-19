private void stopPokeScan() {
    try {
        mapObjectsLoader.interrupt();
        mapObjectsLoader.join(500);
        showProgressbar(false);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}