@java.lang.Override
public void onUpdateResult(org.wordpress.android.ui.reader.actions.ReaderActions.UpdateResult result) {
    if (!(isAdded())) {
        return ;
    }
    setIsUpdating(false, updateAction);
    if (result.isNewOrChanged()) {
        refreshPosts();
    }
}