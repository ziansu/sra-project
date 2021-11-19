@java.lang.Override
public boolean isRationalValue(org.matheclipse.core.interfaces.IRational value) {
    return fApfloat.equals(value.apfloatNumValue(fApfloat.precision()));
}