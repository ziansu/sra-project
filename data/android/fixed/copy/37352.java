private void injectDomContainer(java.lang.Object target) {
    for (de.verygame.xue.handler.TagGroupHandler<?, ?> groupHandler : core.getDomContainer()) {
        de.verygame.xue.util.InjectionUtils.injectByName(de.verygame.xue.annotation.Dependency.class, target, groupHandler);
    }
}