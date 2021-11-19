@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            timeSig = 3;
            break;
        case 1 :
            timeSig = 4;
            break;
    }
}