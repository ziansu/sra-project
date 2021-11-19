@java.lang.Override
public boolean canExecute(final java.util.Collection<? extends org.eclipse.emf.ecore.EObject> selections) {
    for (final org.eclipse.emf.ecore.EObject object : selections) {
        if (object instanceof org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment)
            return true;
        
    }
    return false;
}