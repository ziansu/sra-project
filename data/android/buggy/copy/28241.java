@java.lang.Override
protected android.os.Parcelable onSaveInstanceState() {
    android.os.Parcelable superState = super.onSaveInstanceState();
    return new com.andrognito.patternlockview.PatternLockView.SavedState(superState, com.andrognito.patternlockview.utils.PatternLockUtils.patternToString(mPattern), mPatternViewMode, mInputEnabled, mInStealthMode, mEnableHapticFeedback);
}