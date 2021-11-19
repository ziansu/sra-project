private void loadRepetitionView() {
    main.stage.Loader loader = new main.loader.impl.LoaderImpl(ViewPath.REPETITION_VIEW);
    javafx.scene.layout.Pane view = loader.getView();
    repetitionViewScene = new javafx.scene.Scene(view);
    repetitionViewController = ((main.stage.RepetitionViewController) (loader.getController()));
}