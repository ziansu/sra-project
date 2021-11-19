@java.lang.Override
public void onError(@io.reactivex.annotations.NonNull
java.lang.Throwable error) {
    android.util.Log.e("Schedule", error.toString(), error);
    radonsoft.mireaassistant.helpers.Global.groupID = groupIDBackup;
    radonsoft.mireaassistant.helpers.Global.instituteID = instituteIDBackup;
    TimeManager.TEST.add(radonsoft.mireaassistant.helpers.Global.scheduleNamesOddStringBackup[0]);
    progressDialog.dismiss();
}