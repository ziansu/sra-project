@org.jetbrains.annotations.Nullable
public com.minecolonies.entity.EntityCitizen getWorkerEntity() {
    if ((worker) == null) {
        return null;
    }
    return worker.getCitizenEntity();
}