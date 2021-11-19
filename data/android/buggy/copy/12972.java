public uk.ac.ebi.pride.spectracluster.repo.model.AssayDetail getAssayDetail(java.lang.Long assayId) {
    for (uk.ac.ebi.pride.spectracluster.repo.model.AssayDetail assayDetail : assayDetails) {
        if (assayDetail.getId().equals(assayId)) {
            return assayDetail;
        }
    }
    return null;
}