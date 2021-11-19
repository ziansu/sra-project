private void verifiyStratumNonZeroMass(planet.surface.Stratum stratum, boolean workOnTop) {
    if ((stratum.getMass()) <= 0) {
        if (workOnTop) {
            removeTopStratum();
        }else {
            removeBottomStratum();
        }
    }
}