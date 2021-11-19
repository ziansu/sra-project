private void saveHtmlText() {
    javafx.component.CustomTextTreeItem tr = ((javafx.component.CustomTextTreeItem) (treeView.getSelectionModel().getSelectedItem()));
    if (tr != null) {
        htmlPane.setHtmlText(tr.getHtmlText());
    }
    lastNode = tr;
}