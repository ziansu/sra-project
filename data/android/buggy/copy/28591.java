public void update() {
    issueInstruction();
    execute();
    writeBack();
    startNewExec();
    display();
    java.lang.System.out.println("update finished");
}