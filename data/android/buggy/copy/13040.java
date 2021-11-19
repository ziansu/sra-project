@javax.enterprise.inject.Produces
@javax.enterprise.inject.Specializes
public za.ac.nwu.workflow.backbone.person.service.PersonService producePersonService() {
    if (devmode) {
        return producePersonService();
    }else {
        return workflowPersonService;
    }
}