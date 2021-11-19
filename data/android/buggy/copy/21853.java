@java.lang.Override
public void onClick(android.view.View view) {
    if (attemptLogin()) {
        startActivity(new android.content.Intent(view.getContext(), com.insantani_nostra.arisyaag.insantani.MainActivity.class));
    }
}