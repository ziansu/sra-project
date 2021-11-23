public static void populateWorld() {
    for (assignment4.Critter c : assignment4.CritterWorld.getLivingCritters()) {
        assignment4.CritterWorld.getWorld()[c.y_coord][c.x_coord] = c;
    }
}