@java.lang.Override
public void onResult(java.lang.String location) {
    btnSelectLocation.setText(location);
    com.ib2b.habanerorestaurant.models.BookingForm.getInstance().setLocation(location);
}