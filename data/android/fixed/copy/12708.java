@java.lang.Override
public void openFile(org.rstudio.core.client.files.FileSystemItem file, org.rstudio.core.client.FilePosition position, int navMethod, org.rstudio.studio.client.application.events.EventBus eventBus) {
    eventBus.fireEvent(new org.rstudio.studio.client.workbench.views.source.editors.profiler.OpenProfileEvent(file.getPath(), null, null, false, null));
}