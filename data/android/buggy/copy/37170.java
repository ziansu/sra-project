@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String rejectedReason = editTextRejectedReason.getText().toString();
    requisition.setRemarks(rejectedReason);
    finish();
}