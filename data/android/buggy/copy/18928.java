public void showBannerAdd(android.app.Activity activity) {
    android.widget.LinearLayout adlayout = ((android.widget.LinearLayout) (activity.findViewById(R.id.AdLinearLayout)));
    cn.waps.AppConnect.getInstance(mContext).showBannerAd(mContext, adlayout);
}