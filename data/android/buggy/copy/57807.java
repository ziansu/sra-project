@java.lang.Override
public void onResume() {
    android.widget.Toast.makeText(getApplicationContext(), "Resuming activity", Toast.LENGTH_SHORT).show();
    android.content.Intent serviceIntent = new android.content.Intent(getApplicationContext(), com.example.victor.lfm.MessageService.class);
    startService(serviceIntent);
    super.onResume();
}