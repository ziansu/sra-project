public ui.components.pickers.LabelPickerState nextSuggestion() {
    if (canIncreaseIndex()) {
        return new ui.components.pickers.LabelPickerState(initialLabels, removedLabels, addedLabels, matchedLabels, java.util.OptionalInt.of(((currentSuggestionIndex.getAsInt()) + 1)));
    }
    return this;
}