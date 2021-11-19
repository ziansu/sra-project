@java.lang.Override
public void eat() {
    com.github.fishio.achievements.State old = getState();
    kill();
    notifyObservers(old, getState(), "Lives");
}