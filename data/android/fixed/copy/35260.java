private boolean isInternalIdSet(edu.asu.qstore4s.domain.elements.impl.Element element) {
    return ((element.getInternal_refId()) != null) && (!(element.getInternal_refId().trim().isEmpty()));
}