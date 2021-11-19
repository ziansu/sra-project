public static core.UnifiedPetriLogic.UnifiedPetriNet cloneUnifiedPetriNetWithModifiedScale(core.UnifiedPetriLogic.UnifiedPetriNet source, java.util.Map<java.lang.Integer, java.lang.Double> newScale) {
    return new core.UnifiedPetriLogic.UnifiedPetriNetCloner(source, newScale).aim;
}