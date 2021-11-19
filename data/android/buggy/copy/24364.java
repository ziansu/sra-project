private void onUseretail(bhartiairtel.themehackathon.pojo.GetUserDetailsResponseBean result) {
    android.content.Intent in = new android.content.Intent();
    in.putExtra("result", result);
    startActivity(new android.content.Intent(this, bhartiairtel.themehackathon.main.NavigationDrawerActivity.class));
    finish();
}