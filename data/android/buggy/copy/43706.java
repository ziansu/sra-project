@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    java.lang.System.out.println(("clicked on " + (listServer.getSelectionModel().getSelectedItem())));
    FileToDownload = listServer.getSelectionModel().getSelectedItem();
    java.lang.System.out.println(FileToDownload);
}