private boolean validDataRow(spreadsheet.mapper.model.core.Row row, spreadsheet.mapper.model.meta.SheetMeta sheetMeta) {
    spreadsheet.mapper.w2o.validation.engine.DependencyValidateEngine dependencyValidateEngine = new spreadsheet.mapper.w2o.validation.engine.DependencyValidateEngine(dependencyValidators);
    errorMessages.addAll(dependencyValidateEngine.getErrorMessages());
    return dependencyValidateEngine.valid(row, sheetMeta);
}