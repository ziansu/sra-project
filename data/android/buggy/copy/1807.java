@java.lang.Override
protected void fastInitializeRepositoryNames(org.talend.core.model.process.IElementParameter param) {
    super.fastInitializeRepositoryNames(param);
    if (param.getName().equals(EParameterName.REPOSITORY_VALIDATION_RULE_TYPE.getName())) {
        fastRepositoryUpdateValidationRule(param);
    }
}