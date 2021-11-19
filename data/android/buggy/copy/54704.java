private java.lang.String addItem() {
    org.lhedav.pp.backing_beans.provider.services.AddItem.item.setItemreference(getItemCRC());
    org.lhedav.pp.backing_beans.provider.services.AddItem.service.setSubcategory(org.lhedav.pp.backing_beans.provider.services.AddItem.item.getItemname());
    serviceEjb.createService(org.lhedav.pp.backing_beans.provider.services.AddItem.service, org.lhedav.pp.backing_beans.provider.services.AddItem.item);
    return org.lhedav.pp.persistence.common.Global.STAY_ON_CURRENT_PAGE;
}