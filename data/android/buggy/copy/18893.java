public java.lang.String generateRegexForOneKeyword(java.lang.String regex) {
    return ((regex + (seedu.address.logic.parser.CommandParserHelper.REGEX_CLOSE_BRACE)) + (seedu.address.logic.parser.CommandParserHelper.REGEX_FIRST_DATE)) + (seedu.address.logic.parser.CommandParserHelper.REGEX_RECURRENCE_PRIORITY_CLOSE_BRACE);
}