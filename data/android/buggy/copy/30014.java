public void actionOnNextBtnClick() {
    if ((CUR_INPUT_COMMAND) != null) {
        CUR_INPUT_COMMAND.proceedToNext();
    }else {
        android.widget.Toast.makeText(this, "No previous input.\nSee help for instructions.", Toast.LENGTH_SHORT).show();
    }
}