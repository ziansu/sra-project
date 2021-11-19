protected boolean isXSRFProtectionDisabled(software.sandc.springframework.security.jwt.model.parameter.Parameters parameters) {
    if (parameters != null) {
        java.lang.Boolean isXSRFProtectionDisabled = parameters.getValueOf(software.sandc.springframework.security.jwt.model.parameter.DisableXSRFParameter.class);
        return software.sandc.springframework.security.jwt.util.BooleanUtils.isTrue(isXSRFProtectionDisabled);
    }else {
        return false;
    }
}