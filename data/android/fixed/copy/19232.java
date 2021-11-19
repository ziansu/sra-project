@java.lang.Override
public boolean onNavigationItemSelected(int itemPosition, long itemId) {
    spinnerSelectedValue = itemPosition;
    free.rm.skytube.gui.businessobjects.LoadingProgressBar.get().setProgressBar(progressBar);
    videoGridAdapter.setVideoCategory(free.rm.skytube.businessobjects.VideoCategory.getVideoCategory(itemPosition));
    return true;
}