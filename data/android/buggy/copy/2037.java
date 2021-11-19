public void updateLibrary(android.content.Context context, java.lang.Integer libraryId) {
    this.context = context;
    com.sylweb.myplex.LibraryUtils.UpdateThread thread = new com.sylweb.myplex.LibraryUtils.UpdateThread(libraryId);
    thread.start();
}