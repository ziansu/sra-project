@java.lang.Override
public java.lang.String doInBackground(java.lang.String... params) {
    try {
        java.lang.Thread.sleep(500);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    bl.CampusBLService.refreshHottestPosts();
    return "";
}