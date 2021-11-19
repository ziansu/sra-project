public void setDefaultHeadAndFoot() {
    android.content.Context context = getContext();
    setHeaderView(mLayoutInflater.inflate(R.layout.layout_google_header, mSwipe, false));
    setFooterView(mLayoutInflater.inflate(R.layout.layout_google_footer, mSwipe, false));
}