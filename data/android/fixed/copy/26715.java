@java.lang.Override
public boolean isValidProperty(echowand.net.Property property) {
    echowand.service.result.GetResult.LOGGER.entering(echowand.service.result.GetResult.CLASS_NAME, "isValidProperty", property);
    boolean result = (property.getPDC()) != 0;
    echowand.service.result.GetResult.LOGGER.exiting(echowand.service.result.GetResult.CLASS_NAME, "isValidProperty", result);
    return result;
}