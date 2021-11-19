@java.lang.Override
public void onClick(android.view.View v) {
    allRe.get(java.lang.Integer.parseInt(v.getTag().toString())).setUnderline();
    updateTextNoteControlListners(R.id.action_underline);
}