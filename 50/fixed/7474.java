public void setMonthCellHeight(int height) {
    this.monthCellHeight = height;
    mMonthCellAdapter.notifyDataSetChanged();
    resize();
}