public org.cruxframework.crux.smartfaces.client.breadcrumb.Breadcrumb remove(int index) {
    org.cruxframework.crux.smartfaces.client.breadcrumb.BreadcrumbItem item = getItem(index);
    remove(item, index);
    return this;
}