public void onClickButtonMyReservations(android.view.View view) {
    android.util.Log.v("onClickButtonRes", "OK");
    android.content.Intent intent = new android.content.Intent(this, com.example.tmary.proresto2.ReservationsActivity.class);
    startActivity(intent);
}