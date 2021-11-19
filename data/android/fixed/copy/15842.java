@java.lang.Override
public void visitPhpMethod(@org.jetbrains.annotations.NotNull
com.jetbrains.php.lang.psi.elements.Method method) {
    com.kalessil.phpStorm.phpInspectionsEA.inspectors.semanticalAnalysis.classes.lowerAccessLevel.strategy.ProtectedMembersOfFinalClassStrategy.apply(method, problemsHolder);
}