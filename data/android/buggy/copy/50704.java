@java.lang.Override
public dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> sub(java.math.BigInteger a, dk.alexandra.fresco.framework.Computation<dk.alexandra.fresco.framework.value.SInt> b) {
    dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticSubtractProtocol c = new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticSubtractProtocol(() -> new dk.alexandra.fresco.suite.dummy.arithmetic.DummyArithmeticSInt(a), b);
    builder.append(c);
    return c;
}