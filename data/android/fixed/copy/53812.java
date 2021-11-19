@java.lang.Override
public void onClick(final android.view.View view) {
    ((cgeo.geocaching.ui.EditNoteDialog.EditNoteDialogListener) (getActivity())).onFinishEditNoteDialog(mEditText.getText().toString());
    dialog.dismiss();
}