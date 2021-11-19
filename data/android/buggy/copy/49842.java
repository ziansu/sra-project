@java.lang.Override
public void onHitsChange(int newValue) {
    if ((mSheetPlayerCharacter.getCurHits()) != newValue) {
        mSheetPlayerCharacter.setCurHits(newValue);
        mHitsButton.setText(mSheetPlayerCharacter.getCurHits());
    }
}