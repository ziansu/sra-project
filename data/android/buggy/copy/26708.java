private void selectPackageExplorerItem(int index) {
    org.eclipse.swtbot.swt.finder.widgets.SWTBotTree explorerTree = org.eclipse.egit.ui.test.TestUtil.getExplorerTree();
    org.eclipse.ui.PlatformUI.getWorkbench().getDisplay().syncExec(() -> explorerTree.select(index));
}