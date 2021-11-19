@java.lang.Override
public void showDetails(mac2015.lavit.domain.models.ProjectModel projectModel) {
    projectInfoDetailsFragment.setData(projectModel);
    projectInfoFeedbackFragment.setData(projectModel);
    setupTabs();
}