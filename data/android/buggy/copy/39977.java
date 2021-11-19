@java.lang.Override
public java.lang.Object instantiateItem(android.view.ViewGroup container, int position) {
    android.support.v4.app.Fragment fragment = ((android.support.v4.app.Fragment) (super.instantiateItem(container, position)));
    mIdMapper.put(position, fragment.getId());
    return fragment;
}