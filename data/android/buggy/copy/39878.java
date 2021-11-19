@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    co.gov.inci.evaluon.backend.models.classes.exceptions.BoolException exception = ((co.gov.inci.evaluon.backend.models.classes.exceptions.BoolException) (co.gov.inci.evaluon.backend.models.converters.BoolExceptionConverter.parse(error)));
    co.gov.inci.evaluon.backend.services.gui.ToastService.byResource(this, BoolException.ERROR_DICT.get(exception.getMessage()));
    finish();
}