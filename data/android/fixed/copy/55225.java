@java.lang.Override
public boolean beginDrag(com.google.gwt.event.dom.client.MouseDownEvent event) {
    initialWidth_ = editorPanel_.getWidgetSize(docOutlineWidget_);
    return true;
}