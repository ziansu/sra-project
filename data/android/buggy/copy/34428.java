@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            mProgressDialog = android.app.ProgressDialog.show(com.james.stockparser.MainActivity.this, "連線至伺服器", "取得資料中...請稍候", true);
        }
    });
}