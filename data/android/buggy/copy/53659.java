private void validateMatcherForNoKeyword(java.lang.String regex, java.lang.String args) throws seedu.address.commons.exceptions.IllegalValueException {
    regex += (seedu.address.logic.parser.CommandParserHelper.REGEX_CLOSE_BRACE) + (seedu.address.logic.parser.CommandParserHelper.REGEX_RECURRENCE_PRIORITY_CLOSE_BRACE);
    generateMatcher(regex, args);
}