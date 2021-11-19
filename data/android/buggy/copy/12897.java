public java.lang.Process remove() {
    java.lang.Process c = getCurrent();
    setCurrent(((java.lang.Process) (ioQueue.removeNext())));
    return c;
}