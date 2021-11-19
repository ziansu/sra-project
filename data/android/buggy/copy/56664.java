@org.rstudio.core.client.command.Handler
public void onRestartR() {
    boolean saveChanges = (saveAction_.getAction()) != (org.rstudio.studio.client.application.model.SaveAction.NOSAVE);
    eventBus_.fireEvent(new org.rstudio.studio.client.application.events.SuspendAndRestartEvent(org.rstudio.studio.client.application.model.SuspendOptions.createSaveMinimal(saveChanges), null));
}