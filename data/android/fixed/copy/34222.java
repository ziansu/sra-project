@java.lang.Override
public boolean isContactUsEnabled(int brandId) {
    return com.desk.android.sdk.helper.PropertyHelper.getBooleanWithArgs(buildBrandKey(com.desk.android.sdk.config.ContactUsPropertyConfig.KEY_CONTACT_US_ENABLED), isContactUsEnabled(), properties, brandId);
}