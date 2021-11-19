public static boolean replaceMenuItem(@javax.annotation.Nullable
javax.swing.JMenuItem orginalMenuItem, @javax.annotation.Nonnull
javax.swing.JMenuItem replacementMenuItem) {
    return jmri.util.swing.JMenuUtil.internalReplaceMenuItem(replacementMenuItem, replacementMenuItem);
}