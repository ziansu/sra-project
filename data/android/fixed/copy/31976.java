public java.lang.String getStatusByIds(long researchObjectId, int ResearchObjectVersion, java.lang.String archive) {
    return ((java.lang.String) (org.gfbio.service.persistence.SubmissionFinderUtil.getStatusByIds(researchObjectId, ResearchObjectVersion, archive).get(0)));
}