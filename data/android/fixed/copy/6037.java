public boolean stillToDo() {
    if (!(isThereAvailableMove()))
        return true;
    
    if (isThereNothing()) {
        return true;
    }
    return false;
}