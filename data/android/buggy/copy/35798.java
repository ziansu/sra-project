@java.lang.Override
public com.ctrip.zeus.service.model.impl.Group update(com.ctrip.zeus.service.model.impl.Group group) throws java.lang.Exception {
    autofill(group);
    groupModelValidator.validate(group);
    groupEntityManager.update(group);
    syncVsAndGs(group);
    return group;
}