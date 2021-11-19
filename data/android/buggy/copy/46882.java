@android.support.annotation.Nullable
@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    return new ch.dissem.apps.abit.service.ProofOfWorkService.PowBinder(ch.dissem.apps.abit.service.ProofOfWorkService.engine, this);
}