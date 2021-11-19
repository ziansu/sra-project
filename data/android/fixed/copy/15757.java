@org.junit.Test
public void testProdNa() {
    assertEval("{prod(c(2,4,NA))}");
    assertEval("{prod(c(2,4,3,NA),TRUE)}");
    assertEval("{prod(c(1,2,3,4,5,NA),FALSE)}");
}