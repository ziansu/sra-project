public void setData(com.changkong.model.entities.IssueBean bean) {
    this.mData = bean;
    mAdapter.setData(mData.getPics());
}