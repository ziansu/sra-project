@java.lang.Override
public void onProfileLoaded(cwa115.trongame.User.Profile profile) {
    lastAddedFriendName = ((profile.getName()) == null) ? "/" : profile.getName();
    if ((mostPopularFriendName) != null)
        loadStats(lastAddedFriendName, mostPopularFriendName);
    
}