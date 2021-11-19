@java.lang.Override
public void intercept(com.planyourexchange.rest.service.RequestFacade request) {
    if (isValidToken()) {
        request.addHeader(com.planyourexchange.utils.Constants.AUTHORIZATION, authToken.toString());
    }
}