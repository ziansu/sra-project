private static java.lang.String addTrailingSeparator(java.lang.String original) {
    if (original.endsWith(anper.config.ConfigReader.getInstance().getFileSeparator())) {
        return original + (anper.config.ConfigReader.getInstance().getFileSeparator());
    }else {
        return original;
    }
}