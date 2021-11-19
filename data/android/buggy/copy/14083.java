public void execute(final org.wordpress.android.ui.accounts.helpers.FetchBlogListAbstract.Callback callback) {
    mCallback = callback;
    new java.lang.Thread() {
        @java.lang.Override
        public void run() {
            fetchBlogList(callback);
        }
    }.start();
}