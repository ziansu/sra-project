@java.lang.Override
protected java.lang.Long computeRoundedValue() {
    return (getPrecision()) == null ? null : java.lang.Math.round(((getNumber()) * (java.lang.Math.pow(10, getPrecision()))));
}