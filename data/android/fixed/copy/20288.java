@java.lang.Override
public final void start(final javafx.stage.Stage localStage) throws java.lang.Exception {
    this.stage = localStage;
    main = new gui.windowmanagement.Main();
    main.start(stage);
}