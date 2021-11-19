@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    io.moorea.query_analizer.database.DbHelper.deleteProfilingInfo(selectedDbName);
    loadTreeView();
}