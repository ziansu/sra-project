@java.lang.Override
public T enrich(T production) {
    com.nnpcgroup.cosm.ejb.forecast.jv.impl.JvAlternativeFundingForecastServicesImpl.LOG.log(java.util.logging.Level.INFO, "Enriching forecast {0}...", production);
    return computeClosingStock(computeLifting(computeAvailability(computeSharedOil(computeCarryOil(com.nnpcgroup.cosm.ejb.forecast.jv.impl.JvAlternativeFundingForecastServicesImpl.computeEntitlement(computeGrossProduction(computeOpeningStock(production))))))));
}