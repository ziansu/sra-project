@java.lang.Override
public void onClick(android.view.View v) {
    android.text.style.ImageSpan imageSpan = new android.text.style.ImageSpan(getApplicationContext(), R.drawable.pausebutton);
    contentText.setText(com.jerry.notes.Utils.Span.toJSON(thisUid, "adcfg", Span.NoteSpan.Image));
}