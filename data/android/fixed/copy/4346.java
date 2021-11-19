public int maxPagecount(int pagesize) {
    com.google.common.base.Preconditions.checkArgument((pagesize > 0));
    java.lang.Long size = this.articleDAO.size();
    return 1 + (((size.intValue()) - 1) / pagesize);
}