@java.lang.Override
public boolean apply(@javax.annotation.Nullable
org.sonar.plugins.java.api.tree.VariableTree input) {
    return com.google.common.collect.Iterables.any(input.modifiers().annotations(), org.mule.tools.devkit.sonar.utils.ClassParserUtils.hasAnnotationPredicate(org.mule.api.annotations.param.Optional.class));
}