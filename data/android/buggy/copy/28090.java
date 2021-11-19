public org.polar.athena.domain.InfoShareholder getLatestShareholder(int stockId) {
    return shareholderDao.getLatest(stockId, new org.polar.common.MyDate().addDate(1));
}