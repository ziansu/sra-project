public void setupServiceViewModel() {
    for (io.pivio.view.app.overview.detail.serverresponse.Provides provide : document.service.provides) {
        service.provides.add(new io.pivio.view.app.overview.detail.view.ProvidesModel(provide));
    }
    this.softwareDependencies = document.software_dependencies;
}