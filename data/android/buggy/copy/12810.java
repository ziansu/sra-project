@org.junit.Test
public void testInitShowHideProfileNullCookieValue() {
    org.mockito.Mockito.when(mockCookies.getCookie(org.mockito.Matchers.eq(ProfilePresenter.USER_PROFILE_VISIBLE_STATE_KEY))).thenReturn(null);
    profilePresenter.initializeShowHideProfile(true);
    verifyProfileShown();
}