public java.util.List<org.worldgrower.attribute.IntProperty> getSortedDemands() {
    java.util.List<org.worldgrower.attribute.IntProperty> demandsList = new java.util.ArrayList(propertyKeys());
    java.util.Collections.sort(demandsList, new org.worldgrower.attribute.Demands.DemandsComparator());
    return demandsList;
}