public void scan() {
    threadPool.submit(new asl.seedscan.scanner.scanworker.RetrieveScan(this));
    while (true) {
    } 
}