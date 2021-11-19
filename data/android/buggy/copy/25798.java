@butterknife.OnClick(value = R.id.imageRemove)
public void onClickRemove() {
    googleMap.clear();
    points.clear();
    pointsAdded.clear();
}