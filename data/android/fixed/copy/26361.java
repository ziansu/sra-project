@java.lang.Override
public void onBackPressed() {
    if (!(decision)) {
        android.widget.Toast.makeText(getApplicationContext(), "You have to exit the queue first !", Toast.LENGTH_SHORT).show();
    }else {
        super.onBackPressed();
    }
}