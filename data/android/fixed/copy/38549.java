@java.lang.SuppressWarnings(value = "unused")
public static void main(java.lang.String[] args) {
    de.gwvprojekt.State data = new de.gwvprojekt.StateImpl();
    de.gwvprojekt.Algorithm alg = new de.gwvprojekt.AStar(new de.gwvprojekt.HeuristicCountImpl());
    de.gwvprojekt.ui.GameWerkzeug _game = new de.gwvprojekt.ui.GameWerkzeug(data, alg);
}