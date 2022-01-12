public void refresh() {
    threads = postFacade.GetByParentId(0);
    if ((threads) == null) {
        threads = new java.util.ArrayList<>();
    }
}