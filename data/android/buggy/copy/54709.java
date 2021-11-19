@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_friends_list);
    butterknife.ButterKnife.bind(this);
    setBottomIconDefaultColor();
    mImageFriends.setColorFilter(android.support.v4.content.ContextCompat.getColor(this, R.color.colorPrimary));
    setToolbarWithBackArrow();
}