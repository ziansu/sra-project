@java.lang.Override
public final void start(final javafx.stage.Stage localStage) throws java.lang.Exception {
    this.stage = localStage;
    new gui.windowmanagement.Main().start(stage);
}