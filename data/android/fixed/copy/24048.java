private long multiplicatorCosts() {
    if ((boughtMultiplicators) > 0)
        return ((de.mordsgau.socko.CollectMoneyActivity.MULTIPLICATOR) * (de.mordsgau.socko.CollectMoneyActivity.MULTIPLICATOR_BASE_COSTS)) * (boughtMultiplicators);
    else
        return (de.mordsgau.socko.CollectMoneyActivity.MULTIPLICATOR) * (de.mordsgau.socko.CollectMoneyActivity.MULTIPLICATOR_BASE_COSTS);
    
}