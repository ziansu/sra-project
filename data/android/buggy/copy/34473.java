@javax.transaction.Transactional
public void rewriteAll(java.lang.Iterable<com.cityelf.model.WaterForecast> waterForecasts) {
    waterForecastRepository.deleteAllByPeopleReport(false);
    waterForecastRepository.save(waterForecasts);
}