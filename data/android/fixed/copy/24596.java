void saveAs(android.content.Context context, android.net.Uri uri) {
    ca.rmen.android.poetassistant.main.reader.PoemFile.save(context, uri, poem.get(), mPoemFileCallback);
}