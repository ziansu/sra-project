private void addLineToFavorites() {
    team5.capstone.com.mysepta.Managers.FavoritesManager.addRailLineToFavorites(start, end);
    mOptionsMenu.findItem(R.id.favoriteIcon).setIcon(R.drawable.star_icon);
    favorite = true;
}