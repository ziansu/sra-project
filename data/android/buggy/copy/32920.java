@java.lang.Override
protected void initView(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_splash);
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            startMainActivity();
        }
    }, Constants.SPLASH_TIME);
}