@java.lang.Override
public void onClick(android.view.View v) {
    if (!(hasEmptyFields())) {
        setResult(Activity.RESULT_OK);
        alertDialog.dismiss();
    }
}