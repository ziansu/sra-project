public ui.components.pickers.LabelPickerState previousSuggestion() {
    if (canDecreaseIndex()) {
        return new ui.components.pickers.LabelPickerState(initialLabels, removedLabels, addedLabels, matchedLabels, java.util.OptionalInt.of(((currentSuggestionIndex.getAsInt()) - 1)));
    }
    return this;
}