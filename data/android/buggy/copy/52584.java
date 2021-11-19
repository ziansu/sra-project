public int findUnusedId(android.view.View view) {
    while ((view.getRootView().findViewById((++(fID)))) != null);
    return fID;
}