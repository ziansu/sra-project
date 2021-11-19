public void setMergeCommit(org.ossnoize.git.fastimport.Commit previous) {
    if (null != previous) {
        merge = previous.getMarkID();
    }else {
        merge = null;
    }
}