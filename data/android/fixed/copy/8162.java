@java.lang.Override
public void run() {
    if ((Controller.getList().indexOf(obj)) == (-1)) {
        executorService.shutdown();
    }
    testIt(obj.getUrl());
    java.lang.System.out.println(time);
}