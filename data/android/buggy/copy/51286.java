@butterknife.OnClick(value = R.id.image_map)
public void showMap() {
    setBottomIconDefaultColor();
    mImageMap.setColorFilter(android.support.v4.content.ContextCompat.getColor(this, R.color.colorPrimary));
}