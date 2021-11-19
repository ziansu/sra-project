@org.jetbrains.annotations.NotNull
@java.lang.Override
public com.intellij.openapi.util.TextRange getRelevantTextRange() {
    final int delimiter_length = ((instrumentationTokenType) == (de.qrdn.coco_idea.psi.CocoTypes.INSTRUMENTATION_CODE_ANGLE)) ? 1 : 2;
    return getTextRange().cutOut(com.intellij.openapi.util.TextRange.create(delimiter_length, ((getTextLength()) - delimiter_length)));
}