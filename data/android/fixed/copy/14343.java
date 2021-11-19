public double getPosition() {
    if ((GetActiveControllerModule()) == null)
        return java.lang.Double.NaN;
    
    if ((GetActiveControllerModule().GetActiveSource()) == null)
        return java.lang.Double.NaN;
    
    return GetActiveControllerModule().GetActiveSource().pidGet();
}