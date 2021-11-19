public void setConvertFileList(java.util.ArrayList<util.FileData> arrayList) {
    java.util.ArrayList<util.FileData> fileArray = arrayList;
    tabbedPane.setSelectedComponent(convertTab);
    convertTab.setFileInfo(workspaceTab.getSelectedData());
}