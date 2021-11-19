@java.lang.Override
public com.google.common.base.Optional<com.beautysight.liurushi.identityaccess.domain.model.AccessToken> accessTokenOf(java.lang.String token, com.beautysight.liurushi.identityaccess.domain.model.AccessToken.Type type) {
    return findOneBy(com.beautysight.liurushi.identityaccess.infrastructure.persistence.Conditions.of("type", type).and("accessToken", token));
}