public boolean remove(java.lang.Integer i) {
    try {
        br.com.dextra.pma.utils.CollectionUtils.remove(periods, i);
        return true;
    } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
        return false;
    }
}