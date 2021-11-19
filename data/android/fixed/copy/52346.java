private void setCurrentBranch() {
    com.framgia.wsm.data.model.Branch branch = mUser.getBranches().get(mCurrentBranchPosition);
    mRequestOverTime.setBranch(branch);
    mRequestOverTime.setBranchId(branch.getBranchId());
    notifyPropertyChanged(BR.requestOverTime);
}