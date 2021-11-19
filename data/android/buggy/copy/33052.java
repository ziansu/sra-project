@org.junit.Test
public void testInitShowHideProfileNotOwner() {
    profilePresenter.initializeShowHideProfile(false);
    verifyProfileShown();
    org.mockito.Mockito.verify(mockView, org.mockito.Mockito.atLeastOnce()).setHideProfileButtonVisible(false);
}