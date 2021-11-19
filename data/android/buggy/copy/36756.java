@java.lang.Override
public void run() {
    java.util.Map<java.lang.String, app.model.Currency> data = dataSource.getSpecificData(preset);
    updatable.update(data);
}