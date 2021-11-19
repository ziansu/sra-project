public long maxPagecount(int pagesize) {
    com.google.common.base.Preconditions.checkArgument((pagesize > 0));
    long size = this.articleDAO.size();
    return 1 + ((size - 1) / pagesize);
}