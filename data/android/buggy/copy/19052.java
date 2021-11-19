@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.person_name :
            toggleDetails(v);
            break;
        case R.id.person_call :
            callButtonOnClick(v);
            break;
    }
}