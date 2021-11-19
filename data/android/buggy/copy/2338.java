@java.lang.Override
public void eat() {
    com.github.fishio.achievements.State old = getState();
    notifyObservers(old, getState(), "Lives");
    kill();
}