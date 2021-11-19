@java.lang.Override
public void onUpdate(java.lang.Object o) {
    updateData();
    if ((dispSeries.getSeasonCount()) > 0) {
        changeSeason(dispSeries.getSeason(0));
    }
}