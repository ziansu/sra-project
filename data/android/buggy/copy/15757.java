@org.junit.Test
public void testProdNa() {
    assertEval(Ignored.ImplementationError, "{prod(c(2,4,NA))}");
    assertEval(Ignored.ImplementationError, "{prod(c(2,4,3,NA),TRUE)}");
    assertEval(Ignored.ImplementationError, "{prod(c(1,2,3,4,5,NA),FALSE)}");
}