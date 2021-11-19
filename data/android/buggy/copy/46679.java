public void addCoordinateToList(com.mygdx.game.Coordinates latestBreadCrumb) {
    breadCrumbsList.add(length, latestBreadCrumb);
    if ((length) > 1) {
        breadCrumbsList.remove(((length) - ((length) - 1)));
    }
}