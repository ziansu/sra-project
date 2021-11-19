@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.planyourexchange.app.PlanYourExchangeApplication.getPlanYourExchangeComponent(getActivity()).inject(this);
}