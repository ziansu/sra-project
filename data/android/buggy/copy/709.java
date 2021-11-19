@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    element.setValue((checkedId == (R.id.yes) ? 1 : -1));
}