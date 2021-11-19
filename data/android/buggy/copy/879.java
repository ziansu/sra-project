@com.pratilipi.api.annotation.Get
public com.pratilipi.api.impl.init.shared.GetMobileInitResponse getMobileInit(com.pratilipi.api.impl.init.shared.GetMobileInitRequest request) throws com.pratilipi.common.exception.InsufficientAccessException, java.io.IOException {
    com.pratilipi.api.impl.init.shared.GetMobileInitResponse response = new com.pratilipi.api.impl.init.shared.GetMobileInitResponse();
    com.pratilipi.common.type.Language language = request.getLanguage();
    java.lang.String reponse = com.pratilipi.api.impl.init.MobileInitHelper.prepareHomePageResponse(language);
    response.newInstance(reponse);
    return response;
}