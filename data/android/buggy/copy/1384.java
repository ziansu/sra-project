@org.junit.Test
public void testGetAbstractValueSignState() {
    org.sosy_lab.cpachecker.cpa.sign.SignState signState = SignState.TOP.assignSignToVariable("x", SIGN.PLUSMINUS);
}