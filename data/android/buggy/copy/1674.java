@java.lang.Override
public void onDialogBtnClicked(android.content.Intent data, int whichBtn, int result, int requestCode) {
    switch (requestCode) {
        case com.ndhunju.dailyjournal.controller.HomeActivity.REQUEST_CODE_BACKUP_DIR_PRINTABLE :
            com.ndhunju.dailyjournal.controller.ToolsActivity.onBackUpDirForPrintableSelected(getContext(), data, whichBtn, result);
            break;
    }
}