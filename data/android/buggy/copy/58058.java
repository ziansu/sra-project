private boolean execute_LIST_CLEAR() {
    int listIndex = getListArg();
    if (listIndex == 0)
        return false;
    
    if (!(checkEOL()))
        return false;
    
    com.rfo.basic.Run.theLists.get(listIndex).clear();
    return true;
}