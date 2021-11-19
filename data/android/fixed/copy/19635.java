public boolean saveContainer() {
    if ((container) != null) {
        return postit.shared.Crypto.writeJsonObjectToFile(getContainer(), container.dump().build());
    }else {
        return true;
    }
}