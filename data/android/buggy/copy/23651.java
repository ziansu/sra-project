public void issueInstruction(backend.Instruction curr) {
    for (backend.ReserStation station : stations) {
        if (!(station.isBusy())) {
            station.issueIn(curr);
            break;
        }
    }
}