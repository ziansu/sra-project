@java.lang.Override
public void initCard(int color, int shape, int filterType) {
    mSelected = false;
    mBackground.setBackgroundColor(mContext.getResources().getColor(R.color.base_transparent));
    setCard(color, shape, filterType);
}