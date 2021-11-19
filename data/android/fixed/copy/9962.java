public static void evolve() {
    TSP.chromosomes = Evolution.Evolve(TSP.chromosomes, TSP.cities);
}