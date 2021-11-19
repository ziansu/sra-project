public void recoverSite(int sid) {
    Site s = _sites.get((sid - 1));
    s.recover();
}