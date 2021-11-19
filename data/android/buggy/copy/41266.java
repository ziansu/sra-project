@java.lang.Override
public void write(com.dua3.meja.model.Workbook workbook, java.io.OutputStream out) throws java.io.IOException {
    try (com.dua3.meja.io.CsvWriter writer = com.dua3.meja.io.CsvWriter.create(out, getOptionsWithLocale(options, workbook))) {
        com.dua3.meja.io.CsvWorkbookWriter.writeSheets(workbook, writer);
    }
}