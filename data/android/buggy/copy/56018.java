public java.lang.String complete() {
    data.clear();
    for (pt.uc.dei.aor.paj.ExperimentalPoint p : points) {
        data.add(p.getX(), p.getY());
    }
    data.complete();
    return "/graph";
}