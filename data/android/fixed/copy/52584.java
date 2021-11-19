public int findUnusedId(android.view.View view) {
    while ((view.findViewById((++(fID)))) != null);
    return fID;
}