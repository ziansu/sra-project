public static boolean shouldProcess(java.lang.String uri) {
    if ((eu.leads.ProcessingFilterSingleton.filter) == null)
        return true;
    
    for (java.lang.String f : eu.leads.ProcessingFilterSingleton.filter) {
        if (uri.startsWith(f)) {
            return true;
        }
    }
    return false;
}