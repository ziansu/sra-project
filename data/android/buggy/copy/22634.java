private static boolean isLegalLocaleKeyLiteral(ru.eaze.locale.StringLiteralExpression element) {
    if ((element.getContext()) instanceof ru.eaze.locale.AssignmentExpression) {
        return ru.eaze.locale.EazeLocaleUtil.deepIsValidKey(element.getContents(), element.getProject());
    }
    return false;
}