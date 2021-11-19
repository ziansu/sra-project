public void makeFavouriteOffert(java.lang.String Offertid, java.lang.String UserEmail) {
    com.example.wojciech.groupon.DbUtils.FavouriteOffertAsyncTask bat = new com.example.wojciech.groupon.DbUtils.FavouriteOffertAsyncTask();
    bat.execute(UserEmail, Offertid);
    updateEvents();
}