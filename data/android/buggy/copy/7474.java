public void setMonthCellHeight(int height) {
    this.monthCellHeight = height;
    resize();
    mMonthCellAdapter.notifyDataSetChanged();
}