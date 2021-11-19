@org.springframework.cloud.context.config.annotation.RefreshScope
@org.springframework.context.annotation.Bean
@org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean(name = "logoutAction")
public org.springframework.webflow.execution.Action logoutAction() {
    return new org.apereo.cas.web.flow.LogoutAction(webApplicationServiceFactory, servicesManager, casProperties.getLogout().isFollowServiceRedirects());
}