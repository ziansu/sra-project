private void jobBatchConsequence(com.mygdx.game.JobAbstractBatch jb) {
    if ((jb.getdrivenNeed()) != null) {
        if (!(jb.isJobBatchAborted())) {
        }
        jb.getdrivenNeed().handledBatchInQueue = false;
    }
}