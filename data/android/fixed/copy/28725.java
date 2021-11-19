public void refresh() {
    getFragmentManager().beginTransaction().detach(this).attach(this).commit();
}