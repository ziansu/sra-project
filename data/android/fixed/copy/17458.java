@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError volleyError) {
    super.onErrorResponse(volleyError);
    if ((txt_no_learning) != null) {
        txt_no_learning.setVisibility(View.VISIBLE);
    }
}