@org.springframework.transaction.annotation.Transactional
private fi.hiit.dime.data.Profile storeProfile(fi.hiit.dime.data.Profile profile, fi.hiit.dime.authentication.User user) {
    profile.validatedEvents.clear();
    profile.suggestedEvents.clear();
    profile.validatedInformationElements.clear();
    profile.suggestedInformationElements.clear();
    profile.user = user;
    profileDAO.save(profile);
    return profile;
}