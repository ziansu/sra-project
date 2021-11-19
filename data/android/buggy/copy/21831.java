private void setupUntagOption() {
    parser.logic.Parser.untagOptions.put(OPTIONS.UNTAG, TYPE.INTEGER);
    parser.logic.Parser.untagOptions.put(OPTIONS.UNTAG_SHORT, TYPE.INTEGER);
    parser.logic.Parser.untagOptions.put(OPTIONS.HASHTAG, TYPE.HASHTAG_ARRAY);
    parser.logic.Parser.optionsMap.put(COMMAND_TYPE.UNTAG, parser.logic.Parser.untagOptions);
}