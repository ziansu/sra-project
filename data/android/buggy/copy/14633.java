public double getmTotalCost() {
    mTotalCost = (calculateBase(mOunces)) + (calculateAddedCost(mOunces));
    return mTotalCost;
}