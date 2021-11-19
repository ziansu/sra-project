@java.lang.Override
public lombok.ast.AstVisitor createJavaVisitor(com.android.tools.lint.detector.api.JavaContext context) {
    return new permissions.dispatcher.PermissionsDispatcherOnRequestPermissionsResultDetector.OnRequestPermissionsResultChecker(context);
}