@java.lang.Override
protected java.util.List<com.cs246.bakery.myapplication.model.CakeType> doInBackground(java.lang.Void... params) {
    return new com.cs246.bakery.myapplication.model.CakeType(this).getCakeTypes();
}