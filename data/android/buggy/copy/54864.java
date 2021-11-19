@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i) {
    typeID = (radioGroup.indexOfChild(findViewById(i))) + 1;
}