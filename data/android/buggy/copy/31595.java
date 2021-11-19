public void playMessage(java.lang.String messageKey, java.lang.String[] args) {
    java.lang.System.out.println(org.springframework.context.i18n.LocaleContextHolder.getLocale());
    java.lang.String message = messageSource.getMessage(messageKey, args, org.springframework.context.i18n.LocaleContextHolder.getLocale());
    super.playMessage(message);
}