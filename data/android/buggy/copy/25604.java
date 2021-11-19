protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.friends);
    android.widget.ImageButton disableFriends = ((android.widget.ImageButton) (findViewById(R.id.friends_button)));
    disableFriends.setEnabled(false);
}