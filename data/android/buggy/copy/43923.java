public static boolean isValidArgs(java.lang.String findArgs) {
    return findArgs.matches(seedu.addressbook.commands.FindPersonsByWordsInNameCommand.ARGS_FORMAT.pattern());
}