@java.lang.Override
public void onSelected() {
    super.onSelected();
    view_.focusSearch();
    if ((view_.getMode()) == (org.rstudio.studio.client.workbench.views.history.History.Display.Mode.Recent))
        view_.scrollToBottom();
    
}