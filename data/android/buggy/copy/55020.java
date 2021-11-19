@java.lang.Override
public boolean onBackPressed() {
    if (checkIfDataHasBeenEdited()) {
        showConfirmDiscardDialog();
        return false;
    }else {
        return super.onBackPressed();
    }
}