public boolean inject(java.lang.Object object) {
    if ((activityScopeGraph) != null) {
        activityScopeGraph.inject(object);
        return true;
    }else
        return false;
    
}