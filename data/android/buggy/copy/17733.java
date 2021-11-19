public void speakText() {
    com.kentheken.rishi.FlashCardFragment fragment = ((com.kentheken.rishi.FlashCardFragment) (mViewPager.getAdapter().instantiateItem(mViewPager, mViewPager.getCurrentItem())));
    fragment.setText();
}