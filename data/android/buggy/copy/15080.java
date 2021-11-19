@java.lang.Override
public void setHideSearchMismatches(boolean b) {
    this.mHideSearchMismatches = b;
    repaintNodes(NodeType.IDENTIFIER, "");
    repaintNodes(NodeType.METADATA, "");
}