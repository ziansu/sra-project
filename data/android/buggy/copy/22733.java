@org.springframework.lang.Nullable
@java.lang.Override
protected java.text.MessageFormat resolveCode(java.lang.String code, java.util.Locale locale) {
    java.lang.String msg = tr(code, locale);
    return createMessageFormat(msg, locale);
}