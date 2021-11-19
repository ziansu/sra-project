public edu.sjtu.benchmark.community.procedures.VoltTable[] run(long id1, long id2) {
    voltQueueSQL(GetItem, id1);
    voltQueueSQL(GetItem, id2);
    return voltExecuteSQL(true);
}