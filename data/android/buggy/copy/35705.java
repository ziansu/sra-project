private JavaFile.Term translateUnboundIntegerConstant(java.math.BigInteger constant) {
    long lv = constant.longValue();
    return new wyjc.core.JavaFile.Invoke(null, new java.lang.String[]{ "BigInteger" , "valueOf" }, new wyjc.core.JavaFile.Constant(lv));
}