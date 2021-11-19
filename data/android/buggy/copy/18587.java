@java.lang.Override
public void onDismissed() {
    log("back");
    mEditText.clearFocus();
    onAttachmentHidden();
}