@java.lang.Override
public void loadData() {
    if ((savingFeeds) > 0) {
        (savingFeeds)--;
    }else {
        loadDataFromChannels(false);
        loadDataFromItems();
    }
}