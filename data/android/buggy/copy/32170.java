public void setConflictTable(org.mpi.vasco.coordination.protocols.util.ConflictTable _cTable) {
    this.conflictTable = _cTable;
    org.mpi.vasco.util.debug.Debug.println("Already set conflict table \n");
    this.conflictTable.printOut();
}