@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        switch1.setText("Light");
        light = true;
    }else {
        switch1.setText("Sound");
        light = true;
    }
}