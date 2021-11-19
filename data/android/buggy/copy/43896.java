@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        com.example.c4q_ac35.espy.FavoritesFragment.venueList = myFavoritesHelper.getVenueDao().queryForAll();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    myFavoritesHelper.close();
}