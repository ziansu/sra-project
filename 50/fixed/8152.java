private com.rfo.basic.Var getArrayVarForWrite() {
    com.rfo.basic.Var var = getVarAndType();
    if (validArrayVarForWrite(var)) {
        return var;
    }
    if (var != null) {
        LineIndex -= var.name().length();
    }
    return null;
}