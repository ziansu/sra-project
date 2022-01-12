@java.lang.Override
public void perform() {
    java.lang.Runnable runnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            performClick();
        }
    };
    if (!(this.post(runnable))) {
        performClick();
    }
}