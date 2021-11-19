@org.springframework.cloud.context.config.annotation.RefreshScope
@org.springframework.context.annotation.Bean
@org.springframework.context.annotation.Scope(value = org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public org.apereo.cas.web.view.CasProtocolView cas2ProxySuccessView() {
    return new org.apereo.cas.web.view.CasProtocolView(casProperties.getView().getCas2().getProxy().getSuccess(), this.applicationContext, this.springTemplateEngine, this.properties);
}