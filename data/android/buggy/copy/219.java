@java.lang.Override
public org.orekit.propagation.SpacecraftState resetState(final org.orekit.attitudes.AttitudesSequence.Switch sw, final org.orekit.propagation.SpacecraftState oldState) throws org.orekit.errors.OrekitException {
    return sw.event.resetState(oldState);
}