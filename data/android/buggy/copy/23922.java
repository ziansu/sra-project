public final <T> com.vero.java.api.params.VeroData add(com.vero.java.api.params.Param<T> param) {
    com.vero.java.api.params.VeroData vero = new com.vero.java.api.params.VeroData(this);
    vero.add(param);
    return vero;
}