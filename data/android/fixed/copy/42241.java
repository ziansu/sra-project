public org.votingsystem.dto.currency.BalancesDto getBalancesDto(org.votingsystem.model.User user, org.votingsystem.util.Interval timePeriod) throws java.lang.Exception {
    if (user instanceof org.votingsystem.model.currency.Bank)
        return getBankBalancesDto(((org.votingsystem.model.currency.Bank) (user)), timePeriod);
    else
        return getUserBalancesDto(user, timePeriod, true);
    
}