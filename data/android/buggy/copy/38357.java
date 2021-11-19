static firststep.Font find(int id) {
    java.lang.ref.WeakReference<firststep.Font> f = firststep.Font.allFonts.get(id);
    if (f != null) {
        return f.get();
    }else {
        return null;
    }
}