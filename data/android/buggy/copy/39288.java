@java.lang.Override
public void onCreate() {
    super.onCreate();
    io.realm.Realm.init(this);
    bak.mateusz.quiz.network.NetworkCalls.getQuizzes();
}