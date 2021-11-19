@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    android.widget.CheckBox randomCheckBox = ((android.widget.CheckBox) (findViewById(R.id.random)));
    randomCheckBox.setChecked(random);
}