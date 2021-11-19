@consulo.annotations.RequiredReadAction
@org.jetbrains.annotations.Nullable
@java.lang.Override
public com.intellij.psi.PsiElement findExecutableElementFromDebugInfo(@org.jetbrains.annotations.NotNull
com.intellij.openapi.project.Project project, int executableChildrenAtLineIndex) {
    return consulo.dotnet.mono.debugger.breakpoint.MonoBreakpointUtil.findExecutableElementFromDebugInfo(project, myMethodMirror.debugInfo(), executableChildrenAtLineIndex);
}