@org.springframework.transaction.annotation.Transactional
private fi.hiit.dime.data.Profile storeProfile(fi.hiit.dime.data.Profile profile, fi.hiit.dime.authentication.User user) {
    profile.user = user;
    profileDAO.save(profile);
    return profile;
}