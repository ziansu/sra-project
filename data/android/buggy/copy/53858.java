protected boolean isXSRFProtectionDisabled(software.sandc.springframework.security.jwt.model.parameter.Parameters parameters) {
    java.lang.Boolean isXSRFProtectionDisabled = parameters.getValueOf(software.sandc.springframework.security.jwt.model.parameter.DisableXSRFParameter.class);
    return (parameters != null) && (software.sandc.springframework.security.jwt.util.BooleanUtils.isTrue(isXSRFProtectionDisabled));
}