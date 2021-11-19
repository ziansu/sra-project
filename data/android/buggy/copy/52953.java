public void updateEvaluatorOptions() {
    if ((mFragment.mEvaluator) != null) {
        mFragment.mEvaluator.options.ANGLE_MEASURING_UNITS = mPrefs.getAMU();
    }
}