public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, edu.weber.housing1000.ClientInfoActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    intent.putExtras(getIntent());
    startActivity(intent);
}