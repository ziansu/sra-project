private void initializeDB() {
    java.util.List<model.daoModels.Project> existingProjects = model.daoModels.Project.getAllModels(model.DaoDBHelper.getDaoSession(getApplicationContext()));
    goToInitialActivity();
}