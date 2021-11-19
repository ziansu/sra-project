@java.lang.Override
public void onClick(android.view.View v) {
    sharedPreference.addFavorite(myContext, places.get(position));
    java.lang.String temp = java.lang.String.valueOf(position);
    android.util.Log.v("position", temp);
}