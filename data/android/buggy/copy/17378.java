public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    printToastDialog(bl.Attend(appData.get_userToken(), currEvent.getId(), isChecked));
    appData.set_userEventList(bl.getUserEvents(appData.get_userToken()));
}