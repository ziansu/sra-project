public java.lang.String getInspectorName() {
    if (isImported())
        return Inspectors.WKF.IMPORTED_PROCESS;
    
    return Inspectors.WKF.FLEXO_PROCESS_INSPECTOR;
}