private void finalSaveStep(java.lang.String fileName) {
    if (((mCurrentRotation) != 0) && (fileName != null)) {
        com.jiacorp.couponkeeper.CouponActivity.FileRotator task = new com.jiacorp.couponkeeper.CouponActivity.FileRotator();
        task.execute(mCoupon.id, fileName);
        mCoupon.rotation = mCurrentRotation;
    }
}