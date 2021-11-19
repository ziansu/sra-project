public boolean getHideTags() {
    android.os.Bundle arguments = getArguments();
    if ((cbHideCompleted) == null) {
        return !(arguments.getBoolean(ActiveFilter.INTENT_HIDE_TAGS_FILTER, false));
    }else {
        return !(cbHideTags.isChecked());
    }
}