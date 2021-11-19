public org.anair.drools.model.FiredRulesReturnValues fireRules() {
    org.anair.drools.model.FiredRulesReturnValues firedRulesReturnValues = null;
    try {
        if (org.anair.drools.fluent.api.RulesExecution.RULES_LOG.isInfoEnabled()) {
            auditLoggingContext();
        }
        firedRulesReturnValues = fireRules(true);
    } finally {
        fireRulesPostProcessor(firedRulesReturnValues);
    }
    return firedRulesReturnValues;
}