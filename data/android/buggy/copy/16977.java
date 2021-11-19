public void setMessage(java.lang.String message) {
    if ((message != null) && (isShowing())) {
        tvMessage.setText(message);
    }
}