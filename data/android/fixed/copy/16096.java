@java.lang.Override
public java.lang.String changeNameToFileName(rjm.romek.source.model.Country country) {
    return (parameters.getFlagDir()) + (translatorService.translateToFileName(country.getFlag()));
}