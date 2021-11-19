public org.wicketstuff.openlayers3.api.overlay.Popover show(org.apache.wicket.ajax.AjaxRequestTarget target) {
    hide(target);
    target.appendJavaScript(renderPopoverJs());
    return this;
}