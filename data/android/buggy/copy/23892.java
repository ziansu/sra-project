public static eu.openminted.registry.domain.RightsStatementEnum convert(java.lang.String bestLicence) {
    switch (bestLicence) {
        case "Open Access" :
            return eu.openminted.registry.domain.RightsStatementEnum.OPEN_ACCESS;
        case "12 Months Embargo" :
        case "6 Months Embargo" :
        case "Embargo" :
            return eu.openminted.registry.domain.RightsStatementEnum.EMBARGOED_ACCESS;
        case "Restricted" :
        case "Closed Access" :
            return eu.openminted.registry.domain.RightsStatementEnum.RESTRICTED_ACCESS;
    }
    return null;
}