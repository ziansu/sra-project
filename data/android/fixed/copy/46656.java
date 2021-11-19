@java.lang.Override
public void onGetStoryList(java.util.List<com.codepath.timeline.models.Story> itemList) {
    if (itemList != null) {
        addAll(itemList);
    }
}