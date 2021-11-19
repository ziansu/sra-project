public entity.ResultSet changeDirectory(java.lang.String newDirectory) {
    entity.ResultSet changeResult = new entity.ResultSet();
    commitFullSave();
    entity.ResultSet saveSuccess = dataLoader.saveTo(newDirectory);
    return changeResult;
}