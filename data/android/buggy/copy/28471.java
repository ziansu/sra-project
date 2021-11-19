void addPlayerToUI(com.example.gideonsassoon.avariel.data.Player player) {
    android.widget.EditText mNameEditText = null;
    mNameEditText = ((android.widget.EditText) (findViewById(R.id.et_character_name)));
    mNameEditText.setText(player.getName());
}