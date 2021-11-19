public boolean removeActivity(java.lang.String activityId, java.lang.String userId) throws org.wso2.carbon.social.core.SocialActivityException {
    return getActivityPublisher().remove(activityId, userId);
}