public int maxSize() {
    return endless ? java.lang.Integer.MAX_VALUE : method.getParameterCount();
}