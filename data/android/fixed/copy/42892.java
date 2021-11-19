public void scan() {
    threadPool.execute(new asl.seedscan.scanner.scanworker.RetrieveScan(this));
    while (true) {
    } 
}