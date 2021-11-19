private void checkMaskValidity() throws tools.obfuscation.keyobfuscator.exception.InvalidMaskException {
    if (mask.isEmpty())
        throw new tools.obfuscation.keyobfuscator.exception.InvalidMaskException("Empty");
    
}