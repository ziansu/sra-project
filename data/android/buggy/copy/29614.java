private static void glResumed() {
    cc.openframeworks.OFAndroidLifeCycle.m_activity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            cc.openframeworks.OFAndroidLifeCycle.mGLView.setVisibility(View.VISIBLE);
        }
    });
}