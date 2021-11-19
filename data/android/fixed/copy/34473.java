@javax.transaction.Transactional
public void save(java.lang.Iterable<com.cityelf.model.WaterForecast> waterForecasts) {
    waterForecastRepository.save(waterForecasts);
}