private boolean isNotesPresent(seedu.typed.logic.parser.ArgumentTokenizer argsTokenizer) {
    return !(argsTokenizer.getValue(seedu.typed.logic.parser.CliSyntax.PREFIX_NOTES).equals(java.util.Optional.empty()));
}