private void init() {
    setCardBackgroundColor(getResources().getColor(R.color.card_background));
    if (mRoundCorners) {
        float radius = convertDpToPixel(2, getContext());
        setRadius(radius);
    }else {
        setRadius(0);
    }
}