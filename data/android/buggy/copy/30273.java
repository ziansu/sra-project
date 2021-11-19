public void onClick(android.content.DialogInterface dialog, int which) {
    if (which == (android.content.DialogInterface.BUTTON_POSITIVE)) {
        if ((mOnDialogClickListener) != null) {
            this.mOnDialogClickListener.onClick();
        }
    }
}