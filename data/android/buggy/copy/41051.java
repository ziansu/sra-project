public void onItemClick(android.widget.AdapterView<?> parent, android.view.View v, int position, long id) {
    android.widget.Toast.makeText(this, (position + "#Selected"), Toast.LENGTH_LONG).show();
    makeDialog(listHomeTracks.get(position));
}