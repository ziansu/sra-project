public java.util.ArrayList<java.lang.String> runSim() {
    io.github.krindor.ffxivsimulator.Ninja.SimulatorCore.iterations = 10002;
    io.github.krindor.ffxivsimulator.CurrentJob job = new io.github.krindor.ffxivsimulator.CurrentJob("Ninja");
    io.github.krindor.ffxivsimulator.RunSimThreaded simThreaded = new io.github.krindor.ffxivsimulator.RunSimThreaded();
    return simThreaded.runSim();
}