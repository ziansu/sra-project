@java.lang.Override
public boolean add(final com.webfirmframework.wffweb.tag.html.AbstractHtml e) {
    final boolean added = super.add(e);
    if (added) {
        this.setModified(added);
        sharedObject.setChildModified(added);
    }
    return added;
}