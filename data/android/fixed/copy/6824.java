public java.util.List<double[]> getPath(int index) {
    if (index < (getPaths().size())) {
        return getPaths().get(index);
    }else {
        return null;
    }
}