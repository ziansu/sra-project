@com.exercisevalidator.RequestMapping(value = com.exercisevalidator.ExerciseValidatorController.FILES_URL, method = RequestMethod.GET)
@com.exercisevalidator.ResponseBody
public com.exercisevalidator.FileMetaList getFiles(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    synchronized(this.files) {
        return this.files;
    }
}