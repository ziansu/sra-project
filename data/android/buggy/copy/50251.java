@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    java.lang.System.out.println(("clicked on(upload) " + (list.getSelectionModel().getSelectedItem())));
    FileToUpload = list.getSelectionModel().getSelectedItem();
    java.lang.System.out.println(FileToUpload);
}