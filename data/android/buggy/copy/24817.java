public int compare(com.cardlytics.drelephant.aggregates.UserSeverityAggregate usa1, com.cardlytics.drelephant.aggregates.UserSeverityAggregate usa2) {
    return (usa1.getSortIndex()) < (usa2.getSortIndex()) ? -1 : 1;
}