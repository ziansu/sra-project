@java.lang.Override
public boolean isLeaf() {
    if (!(directoryListLoaded)) {
        loadChildren();
    }
    return getChildren().isEmpty();
}