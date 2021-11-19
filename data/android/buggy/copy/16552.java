public java.util.List<de.uhh.l2g.plugins.model.Institution> getInstitutionsFromLectureseriesIdsAndVideoIds(java.util.ArrayList<java.lang.Long> lectureseriesIds, java.util.ArrayList<java.lang.Long> videoIds) {
    return de.uhh.l2g.plugins.service.persistence.InstitutionFinderUtil.findInstitutionsByLectureseriesIdsAndVideoIds(lectureseriesIds, videoIds);
}