@butterknife.OnClick(value = R.id.randomLocationButton)
public void onRandomButtonClick() {
    generateRandomCoords(latOdessa, lngOdessa);
    goToLocationZoom(randomLatValue, randomLngValue, 13);
}