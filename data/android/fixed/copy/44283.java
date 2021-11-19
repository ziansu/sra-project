@java.lang.Override
public void onResult(java.lang.String location) {
    if ((location == null) || (location.trim().isEmpty()))
        return ;
    
    btnSelectLocation.setText(location);
    com.ib2b.habanerorestaurant.models.OrderForm.get().setTempLocation(location);
}