private void addMoodModule() {
    for (com.nmatte.mood.chart.cell.ReadonlyCheckbox cellView : com.nmatte.mood.logbookentries.MoodList.getCellViews(context, entry.getMoods())) {
        addView(cellView);
    }
}