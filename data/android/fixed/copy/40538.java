@java.lang.Override
public void onConsoleWriteOutput(org.rstudio.studio.client.workbench.views.console.events.ConsoleWriteOutputEvent event) {
    if ((event.getConsole()) != (chunkId_))
        return ;
    
    flushQueuedErrors(true);
    renderConsoleOutput(event.getOutput(), classOfOutput(org.rstudio.studio.client.workbench.views.source.editors.text.ChunkOutputWidget.CONSOLE_OUTPUT), true);
}