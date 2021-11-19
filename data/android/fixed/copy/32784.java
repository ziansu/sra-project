@java.lang.Override
public <T extends org.hisp.dhis.client.sdk.models.common.base.Model> org.hisp.dhis.client.sdk.models.common.state.Action queryActionForModel(T object) {
    org.hisp.dhis.client.sdk.utils.Preconditions.isNull(object, "State object must not be null");
    org.hisp.dhis.client.sdk.models.common.state.State state = queryStateForModel(object);
    if (state != null) {
        return state.getAction();
    }
    return null;
}