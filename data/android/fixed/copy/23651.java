public boolean issueInstruction(backend.Instruction curr) {
    for (backend.ReserStation station : stations) {
        if (!(station.isBusy())) {
            station.issueIn(curr);
            return true;
        }
    }
    return false;
}