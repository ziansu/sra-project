public void DeleteEvent(java.lang.String isAttending, int eventID, java.lang.String eventName) {
    android.widget.Toast.makeText(this, (("Deleting: " + eventName) + " Refresh List from menu"), Toast.LENGTH_LONG).show();
    com.plan_it.mobile.plan_it.UpdateDatabase.DeleteEvent(isAttending, eventID);
}