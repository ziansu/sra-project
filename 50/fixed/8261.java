@java.lang.Override
public void run() {
    if (((parentStatement) != null) && (!(parentStatement.didRun()))) {
        returnType = script.getLogic().run(line, this);
    }
}