@org.junit.Test
public void testBestVector() {
    de.unidue.ltl.gapfill.util.SubstituteVector result = de.unidue.ltl.gapfill.util.SubstituteVectorUtil.getBestSubstituteVector(de.unidue.ltl.gapfill.util.SubstituteVectorUtilTest.sv1, de.unidue.ltl.gapfill.util.SubstituteVectorUtilTest.sv2, de.unidue.ltl.gapfill.util.SubstituteVectorUtilTest.sv3, de.unidue.ltl.gapfill.util.SubstituteVectorUtilTest.sv4, de.unidue.ltl.gapfill.util.SubstituteVectorUtilTest.sv1_b);
    org.junit.Assert.assertEquals(de.unidue.ltl.gapfill.util.SubstituteVectorUtilTest.sv1_b, result);
}