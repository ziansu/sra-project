public java.util.List<org.egov.bpa.application.entity.dto.SearchBpaApplicationForm> search(final org.egov.bpa.application.entity.dto.SearchBpaApplicationForm bpaApplicationForm) {
    final org.hibernate.Criteria criteria = buildSearchCriteria(bpaApplicationForm);
    return buildApplicationDetailsResponse(criteria);
}