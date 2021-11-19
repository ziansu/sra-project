@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    switch (checkedId) {
        case R.id.male :
            sexFactor = 1.0;
            android.util.Log.i("AppInfo", java.lang.String.valueOf(sexFactor));
            break;
        case R.id.female :
            sexFactor = 0.9;
            break;
    }
}