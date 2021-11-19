public static void setTvTitle(java.lang.String title) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.HONEYCOMB)) {
        com.jtmcn.archwiki.viewer.WikiChromeClient.actionBar.setSubtitle(title);
    }else {
        com.jtmcn.archwiki.viewer.WikiChromeClient.tvTitle.setText(title);
    }
}