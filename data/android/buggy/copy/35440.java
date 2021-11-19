public dao.MovingAverageDao getMovingAverage() {
    return (this.cachedMovingAverage) == null ? dao.MovingAverageDao.getMovingAverage(this.symbol) : this.cachedMovingAverage;
}