private void readContactInBackground() {
    new java.lang.Thread() {
        public void run() {
            searchForContactsAndDisplay();
            displayHandler.sendEmptyMessage(0);
        }
    }.start();
}