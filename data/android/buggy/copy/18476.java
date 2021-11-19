@java.lang.Override
public void afterViewChange(ch.bfh.bti7081.s2016.blue.ViewChangeEvent event) {
    ch.bfh.bti7081.s2016.blue.HealthVisUI.menu.setActiveView(event.getViewName());
    ch.bfh.bti7081.s2016.blue.HealthVisUI.menu.addView(event.getNewView(), event.getViewName(), event.getClass().getName(), FontAwesome.NAVICON);
}