public android.database.Cursor getSuggestionById(java.lang.String suggestionId) {
    return getReadableDatabase().query(SuggestionsConstract.SuggestionEntry.TABLE_NAME, null, ((SuggestionsConstract.SuggestionEntry.ID) + " LIKE ?"), new java.lang.String[]{ suggestionId }, null, null, null);
}