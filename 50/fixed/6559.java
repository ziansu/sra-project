@java.lang.Override
public void onSuccess() {
    if (!(view.isActive())) {
        return ;
    }
    loadData(true);
    view.showSuccessfullyDeletedMessage();
}