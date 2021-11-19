public static void evaluatePlans(java.util.ArrayList<source.Plan> plans) {
    for (source.Plan p : plans) {
        if ((plans.size()) == 1) {
            p.setScore = 1;
            break;
        }
    }
}