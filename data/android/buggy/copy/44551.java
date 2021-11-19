@org.opencms.configuration.preferences.PrefMetadata(type = org.opencms.configuration.preferences.CmsGalleryShowInvalidDefaultPreference.class)
public java.lang.String getGalleryShowInvalidDefault() {
    return m_settings.getAdditionalPreference(CmsGalleryService.PREF_GALLERY_SHOW_INVALID_DEFAULT, true);
}