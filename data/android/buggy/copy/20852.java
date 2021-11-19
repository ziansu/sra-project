public void setSuggestionAdapter(vn.eazy.tagview.adapter.SuggestionAdapter suggestionAdapter) {
    if ((suggestionWindow) != null) {
        suggestionWindow.setAdapter(suggestionAdapter);
    }else {
        this.suggestionAdapter = suggestionAdapter;
    }
}