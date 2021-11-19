@java.lang.Override
public void onBackPressed() {
    if (dataChanged) {
        miles.diary.util.Logg.log("DATA CHANGED");
        setResultAction(miles.diary.ui.activity.EntryActivity.Action.EDIT);
    }else {
        super.onBackPressed();
    }
}