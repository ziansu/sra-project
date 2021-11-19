private static boolean CostComparetoDriving(java.lang.String transport_route, java.lang.String driving_route) {
    java.lang.Double transport_cost = 1.4;
    java.lang.Double driving_cost = 5.0;
    return (driving_cost - transport_cost) >= 2.0;
}