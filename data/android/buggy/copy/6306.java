public static org.mvel2.templates.TemplateRegistry getDataModelRegistry(org.drools.semantics.builder.model.ModelFactory.CompileTarget target) {
    switch (target) {
        case XSDX :
            return org.drools.semantics.builder.DLTemplateManager.accessorsRegistry;
        case JAVA :
            return org.drools.semantics.builder.DLTemplateManager.javaRegistry;
        case DRL :
            return org.drools.semantics.builder.DLTemplateManager.traitRegistry;
        case RL :
            return org.drools.semantics.builder.DLTemplateManager.ruleRegistry;
        default :
            return org.drools.semantics.builder.DLTemplateManager.traitRegistry;
    }
}