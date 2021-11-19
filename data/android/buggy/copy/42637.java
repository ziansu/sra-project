private void updateStatus(java.lang.String id, java.lang.String value) {
    spreadsheetService.updateField(id, SpreadsheetDataRow.Field.MP3_STATE, value);
}