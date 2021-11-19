@java.lang.Override
public java.lang.String value() {
    return (org.kframework.kil.FloatBuiltin.printKFloat(value, value::toString)) + (org.kframework.kil.FloatBuiltin.printKFloatSuffix(value, exponent));
}