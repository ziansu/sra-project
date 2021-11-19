private boolean isCommandStringValid() {
    java.util.Set<seedu.address.logic.parser.CommandArgs> argsPresent = argumentValuesMap.keySet();
    if (argsPresent.containsAll(requiredArguments)) {
        return true;
    }
    return false;
}