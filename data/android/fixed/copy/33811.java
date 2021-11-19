@java.lang.Override
public void validate(java.lang.Object target, org.springframework.validation.Errors errors) {
    ch.admin.seco.jobroom.model.JobOffer jobOffer = ((ch.admin.seco.jobroom.model.JobOffer) (target));
    validatePublicationStartDateChangedOnPublishedJob(jobOffer, errors);
}