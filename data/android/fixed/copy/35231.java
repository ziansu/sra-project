@butterknife.OnClick(value = R.id.randomLocationButton)
public void onRandomButtonClick() {
    goToLocationZoom(generateRandomCoords(latOdessa, lngOdessa), 13);
}