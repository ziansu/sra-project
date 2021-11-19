@java.lang.Override
public void run() {
    if (gruppe3.convoy.functionality.SingleTon.dataLoadDone) {
        gruppe3.convoy.AdvancedFragment.autocompleteFragment.getView().setVisibility(View.VISIBLE);
    }else {
        h.postDelayed(this, 100);
    }
}