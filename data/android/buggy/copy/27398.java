@java.lang.Override
public int compare(org.eclipse.debug.core.ILaunchConfigurationType aFirst, org.eclipse.debug.core.ILaunchConfigurationType aSecond) {
    return aSecond.getName().compareTo(aFirst.getName());
}