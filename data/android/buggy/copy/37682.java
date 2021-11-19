public void setSortOrder(com.ivanmagda.habito.models.HabitList.SortOrder sortOrder) {
    if ((mSortOrder) != sortOrder) {
        this.mSortOrder = sortOrder;
        sort();
    }
}