public void start() {
    for (br.unicamp.cst.core.entities.Codelet co : this.getAllCodelets()) {
        co.start();
    }
}