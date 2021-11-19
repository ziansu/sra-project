@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    favids.clear();
    for (com.google.firebase.database.DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
        orbital.raspberry.neighber.Favourite fav = postSnapshot.getValue(orbital.raspberry.neighber.Favourite.class);
        favids.add(fav.getPostid());
    }
}