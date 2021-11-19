public static boolean shouldProcess(java.lang.String uri) {
    if ((eu.leads.ProcessingFilterSingleton.filter) == null)
        return true;
    
    if (org.apache.commons.lang.StringUtils.startsWithAny(uri, eu.leads.ProcessingFilterSingleton.filter))
        return true;
    
    return false;
}