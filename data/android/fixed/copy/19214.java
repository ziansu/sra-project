@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    textView.setText(textOfNote);
    vs.showPrevious();
}