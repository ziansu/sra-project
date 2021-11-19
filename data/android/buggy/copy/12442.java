java.lang.String getMinTemp() {
    if ((mMinTemp) == 990)
        return java.lang.Integer.toString(99);
    
    return java.lang.Integer.toString(((int) (java.lang.Math.round(((mMinTemp) / 10)))));
}