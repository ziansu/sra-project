@com.controller.RequestMapping(value = RestURIConstains.GET_TRAINING_LIST, method = RequestMethod.GET)
@com.controller.ResponseBody
public java.lang.Object getTrainingList(@com.controller.PathVariable(value = "count")
int count, @com.controller.PathVariable(value = "first")
int first) {
    return trainingService.getTrainingListNext(id, count);
}