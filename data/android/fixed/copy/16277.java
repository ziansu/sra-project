@java.lang.Override
public void run() {
    if (!(isChecked)) {
        updateSearchItemsWithTokens(newValue);
        getItems().clear();
        getItems().addAll(items);
    }else
        isChecked = false;
    
    show();
}