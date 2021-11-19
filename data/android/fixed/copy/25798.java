@butterknife.OnClick(value = R.id.imageRemove)
public void onClickRemove() {
    if ((googleMap) != null) {
        googleMap.clear();
        points.clear();
        pointsAdded.clear();
    }
}