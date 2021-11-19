@java.lang.Override
public void loadData() {
    if ((savingFeeds) > 1) {
        (savingFeeds)--;
    }else {
        loadDataFromChannels(false);
        loadDataFromItems();
    }
}