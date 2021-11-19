@com.google.common.annotations.VisibleForTesting
public boolean isPipeSeparated(final java.lang.String line) {
    boolean result = false;
    if ((format) == (org.rf.ide.core.testdata.text.read.separators.TokenSeparatorBuilder.FileFormat.TXT_OR_ROBOT)) {
        result = org.rf.ide.core.testdata.text.read.separators.TokenSeparatorBuilder.PIPE_SEPARATOR_BEGIN.matcher(line).find();
    }
    return result;
}