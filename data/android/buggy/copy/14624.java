public static com.gigigo.rx_clean.domain.interactors.GetUserInteractorRx provideGetUsersInteractorRx() {
    com.gigigo.rx_clean.domain.datasources.UsersDataSource usersDataSource = com.gigigo.rx_clean.di.Injector.provideUsersDataSource();
    return new com.gigigo.rx_clean.domain.interactors.GetUserInteractorRx(usersDataSource, io.reactivex.schedulers.Schedulers.io(), io.reactivex.android.schedulers.AndroidSchedulers.mainThread());
}