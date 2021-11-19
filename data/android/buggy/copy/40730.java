@java.lang.Override
public void handleParsedUnit(com.google.devtools.j2objc.file.InputFile inputFile, org.eclipse.jdt.core.dom.CompilationUnit unit) {
    com.google.devtools.j2objc.util.ErrorUtil.setCurrentFileName(inputFile.getPath());
    processCompilationUnit(unitMap.get(inputFile), unit, inputFile);
}