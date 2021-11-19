@java.lang.Override
public <T extends android.arch.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass) {
    return ((T) (viewModelMap.get(modelClass).get()));
}