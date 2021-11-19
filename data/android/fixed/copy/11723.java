public static void main(java.lang.String[] args) {
    sghku.tianchi.IntelligentAviation.common.Parameter.isPassengerCostConsidered = true;
    sghku.tianchi.IntelligentAviation.common.Parameter.isReadFixedRoutes = true;
    sghku.tianchi.IntelligentAviation.common.Parameter.onlySignChangeDisruptedPassenger = false;
    sghku.tianchi.IntelligentAviation.IntegratedFlightReschedulingLinearProgrammingPhase.runOneIteration(true, 70);
}