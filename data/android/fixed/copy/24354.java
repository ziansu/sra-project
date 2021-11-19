public boolean percolates() {
    return uf.connected(virtualTopSiteId, virtualBottomSiteId);
}