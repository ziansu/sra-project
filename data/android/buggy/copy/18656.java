public void PagingService(java.lang.Class<T> tClass) {
    this.tClass = tClass;
    pagingDao.setClazz(tClass);
}