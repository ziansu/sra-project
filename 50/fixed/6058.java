@java.lang.Override
public void showBottomSheet(com.cloudcontact.cloudcontact.Parse.ParseRow parseRow) {
    if (((bottomSheet) == null) || (!(bottomSheet.isShowing()))) {
        bottomSheet = new com.cloudcontact.cloudcontact.BottomSheet.BottomSheet(this, parseRow);
        bottomSheet.show();
    }
}