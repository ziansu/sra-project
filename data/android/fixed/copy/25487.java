public void startOfNode() throws org.apache.fop.apps.FOPException {
    super.startOfNode();
    getFOEventHandler().startFootnoteBody(this);
}