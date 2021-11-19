private void updateStatus(java.lang.String value) {
    spreadsheetService.updateField(this.getId(), SpreadsheetDataRow.Field.MP3_STATE, value);
}