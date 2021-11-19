private static boolean sameName(org.eclipse.xtext.resource.IEObjectDescription eod, java.lang.String name) {
    return eod.getName().getLastSegment().equalsIgnoreCase(name);
}