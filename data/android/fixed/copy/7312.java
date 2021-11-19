public void addMatchPerformance(int matchday, analyse.SpielPerformance matchPerformance) {
    if (matchPerformance == null)
        matchPerformances.remove(model.Mannschaft.getKey(matchday));
    else
        matchPerformances.put(model.Mannschaft.getKey(matchday), matchPerformance);
    
}