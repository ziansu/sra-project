@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    if ((!(isArrowIcon)) && ((preFilter) != null)) {
        preFilter.hide();
    }else {
        isArrowIcon = false;
    }
}