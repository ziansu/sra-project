private int getReplyTo() {
    return radioReplyTo.indexOfChild(findViewById(radioReplyTo.getCheckedRadioButtonId()));
}