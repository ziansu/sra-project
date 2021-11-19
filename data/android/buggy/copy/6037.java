public boolean stillToDo() {
    if (!(isThereAvailableMove()))
        return true;
    
    if (isThereNothing()) {
        return true;
    }
    if (isThereAnythingToErase()) {
        return true;
    }
    return false;
}