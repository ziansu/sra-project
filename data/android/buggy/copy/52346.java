private void setCurrentBranch() {
    com.framgia.wsm.data.model.Branch branch = mUser.getBranches().get(mCurrentBranchPosition);
    mRequestOverTime.setBranchId(branch.getBranchId());
    mRequestOverTime.setBranch(branch);
    notifyPropertyChanged(BR.requestOverTime);
}