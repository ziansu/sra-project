private android.app.Dialog selectPgnFileDialog() {
    return selectFileDialog(org.mdc.chess.MDChess.pgnDir, R.string.select_pgn_file, R.string.no_pgn_files, "currentPGNFile", new org.mdc.chess.MDChess.Loader() {
        @java.lang.Override
        public void load(java.lang.String pathName) {
            loadPGNFromFile(pathName);
        }
    });
}