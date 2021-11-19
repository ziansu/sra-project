@java.lang.Override
public java.lang.Object enter(final cz.cuni.mff.xrg.odcs.frontend.gui.views.executionlist.ExecutionListPresenter presenter) {
    this.presenter = presenter;
    if (!(presenter.isLayoutInitialized())) {
        buildPage(presenter);
    }
    hideDebugWindow();
    return this;
}