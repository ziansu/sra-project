@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    pageList.get(p).setIsSelected(isChecked);
}