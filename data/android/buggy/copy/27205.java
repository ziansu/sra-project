@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_game_list);
    viewModel = new ui.com.lightrpg.lightrpgui.game.GameListViewModel();
    setupDrawer();
    setupTopBar();
    setupGameList();
    setupBottomsheet();
}