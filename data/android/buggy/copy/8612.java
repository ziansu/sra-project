public boolean contains(java.lang.String ID) {
    nu.xom.Element e = getElementByID(ID);
    boolean res = false;
    if (e != null) {
        res = true;
    }
    return res;
}