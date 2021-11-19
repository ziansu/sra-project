public void pre() {
    for (int p = 0; p < (parts.size()); p++) {
        prototype.Part part = parts.get(p);
        part.pre(false);
    }
}