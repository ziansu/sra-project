@java.lang.Override
public void optionalText(java.lang.String text) {
    htmlString.append(org.spdx.licenseTemplate.SpdxLicenseTemplateHelper.escapeHTML(text, false));
}