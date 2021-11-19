@java.lang.Override
public void notify(org.shaolin.bmdp.runtime.entity.EntityAddedEvent<org.shaolin.bmdp.datamodel.page.WebService, org.shaolin.bmdp.datamodel.common.DiagramType> event) {
    try {
        org.shaolin.uimaster.page.cache.PageCacheManager.addWebService(event.getEntity());
    } catch (org.shaolin.javacc.exception.ParsingException e) {
        e.printStackTrace();
    }
}