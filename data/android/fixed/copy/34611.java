private org.python.core.PyObject importRunnerClass() {
    interpreter.exec("import robot; from robot.jarrunner import JarRunner");
    return interpreter.get("JarRunner");
}