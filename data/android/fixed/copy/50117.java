@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.settings :
            android.content.Intent intent = new android.content.Intent(this, com.example.ajinkya.stayhealthysg.SettingsActivity.class);
            startActivity(intent);
            break;
    }
    return super.onOptionsItemSelected(item);
}