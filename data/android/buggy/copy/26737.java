@java.lang.Override
public com.vaadin.ui.Layout getNavigationContainer(com.github.appreciated.quickstart.base.navigation.interfaces.base.ContainerSubpage page) {
    com.github.appreciated.quickstart.material.components.MaterialNavigationContainerView container = new com.github.appreciated.quickstart.material.components.MaterialNavigationContainerView();
    if (page.hasPadding()) {
        container.addStyleName("container-padding");
    }
    return container;
}