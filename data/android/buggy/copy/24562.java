@java.lang.Override
public void onClick(android.view.View view, int position) {
    com.exalt.vmuseum.services.PlacesResponseService.getPlaceDetails(position, placeDetailsCallback);
}