@java.lang.Override
public void run() {
    mainActivity.setContentView(tf);
    tf.setText(contents);
    mainActivity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            tf.requestFocus();
        }
    });
}