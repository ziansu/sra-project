public static boolean isDisabled() {
    org.jenkins.ci.plugins.keyboard_shortcuts.KeyboardShortcutsPageDecorator.LOG.info("isDisabled()");
    return org.jenkins.ci.plugins.keyboard_shortcuts.KeyboardShortcutsPageDecorator.isDisabled(hudson.model.User.current());
}