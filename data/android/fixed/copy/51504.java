private boolean validDataRow(spreadsheet.mapper.model.core.Row row, spreadsheet.mapper.model.meta.SheetMeta sheetMeta) {
    spreadsheet.mapper.w2o.validation.engine.DependencyValidateEngine dependencyValidateEngine = new spreadsheet.mapper.w2o.validation.engine.DependencyValidateEngine(dependencyValidators);
    boolean result = dependencyValidateEngine.valid(row, sheetMeta);
    errorMessages.addAll(dependencyValidateEngine.getErrorMessages());
    return result;
}