@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getApplicationContext(), "Favoris", Toast.LENGTH_SHORT).show();
    drawerLayout.closeDrawer(Gravity.LEFT);
}