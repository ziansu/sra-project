@com.oracle.truffle.api.dsl.Specialization
protected com.oracle.truffle.r.runtime.data.RStringVector format(com.oracle.truffle.r.runtime.env.REnvironment value, boolean trim, int digits, int nsmall, int width, int justify, boolean naEncode, int scientific, java.lang.String decimalMark) {
    return com.oracle.truffle.r.runtime.data.RDataFactory.createStringVector(value.getPrintName());
}