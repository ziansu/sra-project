@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    stopPlaying();
    fine = false;
    android.widget.Toast.makeText(this, "Inform Emergency Services", Toast.LENGTH_SHORT).show();
}