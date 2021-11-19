protected void onResume() {
    super.onResume();
    getWindow().getDecorView().post(new java.lang.Runnable() {
        public void run() {
            mRefreshLayout.startAutoRefresh();
        }
    });
}