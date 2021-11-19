public void load(org.apache.poi.ss.usermodel.Workbook book, io.konig.core.Graph graph) throws io.konig.spreadsheet.SpreadsheetException {
    io.konig.spreadsheet.WorkbookLoader.Worker worker = new io.konig.spreadsheet.WorkbookLoader.Worker(book, graph);
    worker.run();
}