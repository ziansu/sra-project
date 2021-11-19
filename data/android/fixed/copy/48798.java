@java.lang.Override
public java.lang.String getIrString() {
    if (value.isPresent()) {
        return java.lang.String.format("\"%s\"=\"%s\"", attr, value.get());
    }else {
        return java.lang.String.format("\"%s\"", attr);
    }
}