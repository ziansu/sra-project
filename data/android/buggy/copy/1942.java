@java.lang.Override
public void run() {
    mCurrentBuildRootElement.addChild(new com.facebook.buck.intellij.plugin.ui.tree.BuckTreeNodeDetail(mCurrentBuildRootElement, BuckTreeNodeDetail.DetailType.ERROR, message));
    this.mTreeModel.reload();
}