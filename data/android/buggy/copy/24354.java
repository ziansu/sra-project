public boolean percolates() {
    return this.uf.connected(this.virtualTopSiteId, this.virtualBottomSiteId);
}