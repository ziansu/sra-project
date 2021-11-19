@java.lang.Override
@com.google.inject.persist.Transactional(rollbackOn = { com.axelor.exception.AxelorException.class , java.lang.Exception.class })
public com.axelor.apps.project.db.ProjectTask copy(com.axelor.apps.project.db.ProjectTask entity, boolean deep) {
    com.axelor.apps.project.db.ProjectTask project = super.copy(entity, false);
    project.setStatusSelect(com.axelor.apps.project.db.repo.STATE_PLANNED);
    save(project);
    return project;
}