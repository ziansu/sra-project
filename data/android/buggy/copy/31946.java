public void onClick(android.content.DialogInterface dialog, int id) {
    android.content.Intent i = new android.content.Intent(getApplicationContext(), ms_br.appriuso.ItemActivity.class);
    startActivity(i);
    finish();
    markerTemp.remove();
}