@com.pratilipi.api.annotation.Get
public com.pratilipi.api.impl.init.shared.GetMobileInitResponse getMobileInit(com.pratilipi.api.impl.init.shared.GetMobileInitRequest request) throws com.pratilipi.common.exception.InsufficientAccessException, java.io.IOException {
    com.pratilipi.common.type.Language language = request.getLanguage();
    return new com.pratilipi.api.impl.init.shared.GetMobileInitResponse(com.pratilipi.api.impl.init.MobileInitHelper.prepareHomePageResponse(language));
}