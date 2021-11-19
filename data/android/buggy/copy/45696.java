public void setSeed(long seed) {
    if ((getSeed()) != seed) {
        setProperty(new org.apache.jmeter.testelement.property.LongProperty(org.apache.jmeter.control.WeightedDistributionController.SEED, seed));
        getRandomizer().setSeed(seed);
    }
}