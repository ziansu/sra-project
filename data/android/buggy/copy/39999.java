@org.junit.Test
public void testInitShowHideProfileEmptyCookieValue() {
    org.mockito.Mockito.when(mockCookies.getCookie(org.mockito.Matchers.eq(ProfilePresenter.USER_PROFILE_VISIBLE_STATE_KEY))).thenReturn("");
    profilePresenter.initializeShowHideProfile(true);
    verifyProfileShown();
}