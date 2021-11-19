private void loadTables() {
    vocabletrainer.heinecke.aron.vocabletrainer.lib.Database db = new vocabletrainer.heinecke.aron.vocabletrainer.lib.Database(this.getBaseContext());
    java.util.List<vocabletrainer.heinecke.aron.vocabletrainer.lib.Storage.Table> tables = db.getTables();
    adapter.addAllUpdated(tables);
}