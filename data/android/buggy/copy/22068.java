private void checkPageStatus() {
    if (((model.getQuery()) == null) || ("".equals(model.getQuery()))) {
        setPageComplete(false);
        return ;
    }
    setPageComplete(true);
}