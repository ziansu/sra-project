public boolean removeResponseForCharacters(java.lang.String username) {
    for (networking.response.ResponseRenderCharacter response : renderCharacterResponses) {
        if ((response.getUsername()) == username) {
            return renderCharacterResponses.remove(response);
        }
    }
    return false;
}