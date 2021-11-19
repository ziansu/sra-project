protected ch.heigvd.amt.gamification.model.Application tryToRetrieveApplication(java.lang.String apiKey) {
    ch.heigvd.amt.gamification.model.Application app = applicationsManager.retrieveApplicationByApikey(apiKey);
    if (app == null)
        throw new java.lang.NullPointerException("This application doesn't exists");
    
    return app;
}