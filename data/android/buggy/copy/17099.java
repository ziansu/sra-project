private static boolean postProcessingHelper_isAdditionalInfoAlreadyPresent(edu.iitd.cse.open_nre.onre.domain.OnreExtraction onreExtraction) {
    edu.iitd.cse.open_nre.onre.helper.OnreHelper.removeAdditionalInfoIfAlreadyPresent(onreExtraction);
    if (edu.iitd.cse.open_nre.onre.helper.OnreHelper.postProcessingHelper_isAdditionalInfoStillPresent(onreExtraction))
        return true;
    
    return false;
}