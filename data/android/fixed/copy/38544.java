private java.lang.String trimArgsOfTags(java.lang.String args) {
    return args.replaceAll(((seedu.watodo.logic.parser.CliSyntax.PREFIX_TAG.getPrefix()) + "(\\S+)"), "").trim();
}