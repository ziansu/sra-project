@java.lang.Override
public void onClick(android.view.View v) {
    if ((com.visiontech.yummysmile.ui.adapter.MainCardsAdapter.listener) != null) {
        com.visiontech.yummysmile.ui.adapter.MainCardsAdapter.listener.onMealCardClicked(meal);
    }
}