public void readFile(javafx.event.ActionEvent actionEvent) throws java.io.IOException {
    graph = sample.Graph.fromFile(filePath.getText());
    rerenderGraph();
}