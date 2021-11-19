@java.lang.Override
public boolean validate() throws com.intellij.openapi.options.ConfigurationException {
    return (!(selectedCourse.isAdaptive())) || ((selectedCourse) != (com.jetbrains.tmp.learning.stepik.CourseInfo.INVALID_COURSE));
}