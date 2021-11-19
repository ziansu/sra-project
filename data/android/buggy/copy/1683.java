@org.junit.Test
public void runArgsTest() {
    com.laboon.CoffeeMaker testcm = new com.laboon.CoffeeMaker();
    int retval = testcm.runArgs("string");
    AssertEquals(retval, 0);
}