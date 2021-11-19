public boolean isExclusive() {
    if (getDelimiter().isPresent()) {
        return getDelimiter().get().equals(backend.resource.TurboLabel.EXCLUSIVE_DELIMITER);
    }else {
        return false;
    }
}