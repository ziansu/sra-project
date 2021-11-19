@java.lang.Override
public java.util.List<java.lang.String> availableStateNames() {
    java.util.List<java.lang.String> names = regionProvider.getStateNames();
    names.add(org.motechproject.nms.ldapbrowser.region.RegionServiceImpl.ALL);
    return names;
}