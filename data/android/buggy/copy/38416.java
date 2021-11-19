public projMngmntSaaS.domain.entities.projectLevel.artifacts.Resource getSupervisor() {
    if ((supervisor.getType()) != (projMngmntSaaS.domain.entities.enums.ResourceType.HUMAN)) {
        throw new java.lang.IllegalArgumentException((("Supervisor can only be a resource of type " + (projMngmntSaaS.domain.entities.enums.ResourceType.HUMAN)) + "."));
    }
    return supervisor;
}