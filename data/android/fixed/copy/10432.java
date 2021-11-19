protected java.lang.String getField(int index) {
    if (index <= (NF)) {
        return field.get(index);
    }else {
        return "";
    }
}