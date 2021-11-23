public void previousClick(android.view.View view) {
    if ((currentPosition) > 0) {
        (currentPosition)--;
        viewPager.setCurrentItem(currentPosition, true);
        updateProgress();
    }else {
    }
}