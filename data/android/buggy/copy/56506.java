@java.lang.Override
public com.talk2object.plum.view.web.component.WebComponent visit(com.talk2object.plum.view._abstract.components.menu.MenuItem component) {
    setIdIfNull(component);
    return commonVisit(com.talk2object.plum.view.web.component.menu.WebMenuItem.class, com.talk2object.plum.view._abstract.components.menu.MenuItem.class, component);
}