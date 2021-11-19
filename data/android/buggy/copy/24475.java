private int getReplyTo() {
    android.util.Log.i(logTag, ("returning replyto " + (radioReplyTo.indexOfChild(findViewById(radioReplyTo.getCheckedRadioButtonId())))));
    return radioReplyTo.indexOfChild(findViewById(radioReplyTo.getCheckedRadioButtonId()));
}