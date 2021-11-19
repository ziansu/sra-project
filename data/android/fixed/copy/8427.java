public int count(com.ubikz.scraper.core.app.dal.filter.AbstractDalFilter filter) {
    return this.count(this.getBaseSelect(filter, true));
}