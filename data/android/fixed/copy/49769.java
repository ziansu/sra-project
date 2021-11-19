@java.lang.Override
public void onResult(java.util.List<com.mtesitoo.backend.model.Product> result) {
    mProductListAdapter.refresh(((java.util.ArrayList<com.mtesitoo.backend.model.Product>) (result)));
    if ((pd) != null) {
        pd.dismiss();
    }
}