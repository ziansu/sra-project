public boolean checkAdv(java.lang.String _string) {
    if ((_string.isEmpty()) || (myadv.containsKey(_string)))
        return true;
    
    return false;
}