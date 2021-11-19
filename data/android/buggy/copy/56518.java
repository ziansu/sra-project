public void generateMatcherForOneKeyword(java.lang.String args, java.lang.String regex) throws seedu.address.commons.exceptions.IllegalValueException {
    java.lang.String regexCopy = generateRegexForOneKeyword(regex);
    generateMatcher(regexCopy, args);
}