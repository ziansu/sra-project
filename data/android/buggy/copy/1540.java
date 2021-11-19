@javax.inject.Singleton
@dagger.Provides
com.kamk2k.alkobuddy.presenter.MainActivityPresenter provideMainActivityPresenter(com.kamk2k.alkobuddy.presenter.logic.UserStateChangeHandler userStateChangeHandler, android.os.Handler updateHandler, com.kamk2k.alkobuddy.presenter.CreateDrinkPresenter createDrinkPresenter) {
    return new com.kamk2k.alkobuddy.presenter.MainActivityPresenterImpl(userStateChangeHandler, updateHandler, createDrinkPresenter);
}