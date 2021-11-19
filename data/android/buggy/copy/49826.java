@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    if ((org.mti.hip.utils.VisitDiagnosisListAdapter.stiContactsTreated) <= 0) {
        showStiContactsDialog();
    }
}