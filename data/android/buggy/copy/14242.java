@java.lang.Override
public void onClick(android.view.View v) {
    allRe.get(java.lang.Integer.parseInt(v.getTag().toString())).setHeading(1);
    updateTextNoteControlListners(R.id.action_heading1);
}