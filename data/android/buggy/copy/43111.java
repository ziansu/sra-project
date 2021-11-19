@org.junit.Test
public void AtleastOneHTestFive() {
    assertTrue(edu.utep.cs5374.ltlgenerator.cp.CPUnitTests.TestCP(new edu.utep.cs5374.ltlgenerator.cp.AtleastOneH().compute(3), "(p0|p1|p2)"));
}