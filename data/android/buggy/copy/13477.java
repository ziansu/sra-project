@java.lang.Override
protected void addTimeConjunctions(java.util.Set<java.lang.String> predicatesIDs) {
    currentClause.addConjunctedPredicates(predicatesIDs);
    java.lang.System.out.println(("adding: " + predicatesIDs));
}