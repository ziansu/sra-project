public boolean contains(java.lang.String id) {
    nu.xom.Element e = getElementByID(id);
    boolean res = false;
    if (e != null) {
        res = true;
    }
    return res;
}