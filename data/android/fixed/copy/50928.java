@java.lang.Override
public java.lang.Boolean call() {
    return ctx.widgets.component(GrandExchange.WIDGET, GrandExchange.ABORT_OFFER_COMPONENT).visible() ? ctx.widgets.component(GrandExchange.WIDGET, GrandExchange.ABORT_OFFER_COMPONENT).click() : true;
}