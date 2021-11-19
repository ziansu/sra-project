private boolean ValidateConditions() throws oop.ex6.main.badConditionFormat, oop.ex6.main.noSuchVariable {
    for (oop.ex6.main.Scope scope : scopes) {
        java.util.ArrayList<oop.ex6.main.ConditionScope> conditionScopes = scope.getInternalScopes();
        for (oop.ex6.main.ConditionScope cScope : conditionScopes)
            cScope.validateConditions();
        
    }
    return true;
}