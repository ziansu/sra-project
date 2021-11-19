private void initData() {
    if (isStranger) {
        randos = com.github.randoapp.db.RandoDAO.getAllOutRandos();
    }else {
        randos = com.github.randoapp.db.RandoDAO.getAllInRandos();
    }
    size = randos.size();
}