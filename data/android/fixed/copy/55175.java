@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean b) {
    c.setData(b);
    saveGameToDatabase();
}