public javafx.scene.layout.VBox getView() {
    if ((view) == null)
        view = loadFXML();
    
    return view;
}