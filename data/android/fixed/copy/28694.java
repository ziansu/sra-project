@org.testng.annotations.Test(timeOut = 120000)
public void testGenerator() throws io.github.pr0methean.betterrandom.seed.SeedException {
    final io.github.pr0methean.betterrandom.seed.SeedGenerator generator = RandomDotOrgSeedGenerator.RANDOM_DOT_ORG_SEED_GENERATOR;
    final byte[] seed = generator.generateSeed(32);
    assert (seed.length) == 32 : "Failed to generate seed of correct length";
    generator.generateSeed(seed);
}