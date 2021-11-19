@org.junit.Test
public void onSuccess() throws java.lang.Exception {
    com.example.bigmercu.perfectmodel.presenter.UserInfoPresenter userInfoPresenter = org.mockito.Mockito.mock(com.example.bigmercu.perfectmodel.presenter.UserInfoPresenter.class);
    mUserInfoPresenter.getUserInfo("Bigmercu");
    org.mockito.Mockito.verify(userInfoPresenter).onSuccess(mGithubUserTest);
}