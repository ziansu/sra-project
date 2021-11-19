private void mouseScrollHandler() {
    myRoot.addEventHandler(javafx.scene.input.ScrollEvent.SCROLL, ( event) -> {
        (color)++;
        if (!((color) < (colors.length)))
            color = 0;
        
    });
}