@java.lang.Override
protected void instantiateGeneratorService(domain.businessrule.BusinessRule businessRule) {
    domain.generator.GeneratorServiceImpl service = new domain.generator.GeneratorServiceImpl(businessRule.getTargetDatabase());
}