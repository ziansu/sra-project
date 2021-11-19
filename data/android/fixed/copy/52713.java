private void showLoading(boolean b) {
    if (b) {
        binding.load.setVisibility(View.VISIBLE);
    }else {
        binding.load.setVisibility(View.GONE);
    }
}