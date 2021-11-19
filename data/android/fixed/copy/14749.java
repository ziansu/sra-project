@java.lang.Override
public void visitLineNumber(int line, org.objectweb.asm.Label start) {
    super.visitLineNumber(line, start);
    currentLine = line;
    currentIndex = 0;
}