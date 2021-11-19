@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String[] paths = com.github.angads25.filepicker.model.MarkedItemList.getSelectedPaths();
    callbacks.onSelectedFilePaths(paths);
    dismiss();
}