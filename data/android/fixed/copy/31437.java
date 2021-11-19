@java.lang.Override
public java.util.Iterator<com.day.cq.wcm.api.Page> listChildren(com.day.cq.commons.Filter<com.day.cq.wcm.api.Page> pageFilter, boolean deep) {
    return new com.twcable.jackalope.impl.cq.PageIteratorImpl(resource, pageFilter, deep);
}