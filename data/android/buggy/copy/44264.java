@java.lang.Override
public android.content.Loader<java.util.ArrayList<com.example.picturemanager.MyImage>> onCreateLoader(int id, android.os.Bundle args) {
    android.util.Log.d("AND", "HERE");
    return new com.example.picturemanager.ImageLoaderAsyncTask(activity, page, category);
}