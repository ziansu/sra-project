@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(getApplicationContext(), "Difficulty picked", Toast.LENGTH_LONG).show();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.lenni.blackjack_ptm.SettingsActivity.class);
    startActivity(intent);
}