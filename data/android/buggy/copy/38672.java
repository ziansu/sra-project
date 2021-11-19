private double getInfectionTime(double min, double max, dr.evomodel.epidemiology.casetocase.AbstractCase infected) {
    final double branchLength = max - min;
    return max - (branchLength * (infected.getInfectionBranchPosition().getParameterValue(0)));
}