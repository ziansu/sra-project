private void writeHarvestedBiomass() throws java.io.IOException {
    double biomass = edu.mtu.steppables.marketplace.AggregateHarvester.getInstance().getBiomass();
    biomass = greenTonToBoneDryTon(biomass, 0.62);
    appendToCsv(edu.mtu.wup.model.WupScorecard.biomassFile, biomass);
}