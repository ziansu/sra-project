void setCommitHelper(elegit.CommitHelper commitHelper) {
    this.commitHelper = commitHelper;
    header.setText((((header.getText()) + "from ") + (commitHelper.getId().substring(0, 8))));
}