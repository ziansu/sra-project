public void displayText(java.lang.String _str) {
    if (_str == null)
        return ;
    
    str = new java.lang.String(_str);
    invalidate();
}