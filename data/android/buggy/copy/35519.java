public boolean isInvalidTypeToAdd(parser.logic.ParseLogic.COMMAND_TYPE commandType) {
    switch (commandType) {
        case UNDO :
        case REDO :
            return false;
        default :
            return true;
    }
}