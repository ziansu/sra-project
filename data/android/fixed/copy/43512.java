private boolean isTokenExistInCookies() {
    token = com.google.gwt.user.client.Cookies.getCookie(Constants.COOKIE_TOKEN_NAME);
    boolean exist = (token) != null;
    com.epsm.gwtHibernateHello.client.presenter.PagePresenter.logger.finer((("Invoked: isTokenExistInCookies(), returned '" + exist) + "'."));
    return exist;
}