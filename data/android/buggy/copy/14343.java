public double getPosition() {
    if ((GetActiveController()) == null)
        return java.lang.Double.NaN;
    
    return GetActiveControllerModule().GetActiveSource().pidGet();
}