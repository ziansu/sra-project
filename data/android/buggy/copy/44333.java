public void setOnCancelButtonClickListener(android.view.View.OnClickListener onCancelButtonClickListener) {
    this.onCancelButtonClickListener = onCancelButtonClickListener;
    if ((buttonCancel) != null)
        buttonCancel.setOnClickListener(onAcceptButtonClickListener);
    
}