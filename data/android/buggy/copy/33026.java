@java.lang.Override
public void unload() {
    if (noCode) {
        return ;
    }
    if ((instructions) != null) {
        instructions.clear();
    }
    blocks = null;
    exitBlocks = null;
    exceptionHandlers.clear();
    noCode = true;
}