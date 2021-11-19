@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int item) {
    switch (item) {
        case 0 :
            startPreferenceActivity();
            break;
        case 1 :
            showDialog(R.id.dialog_gps_menu);
            break;
    }
}