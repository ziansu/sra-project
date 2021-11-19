@java.lang.Override
public void onClick(android.view.View v) {
    mndev.groupreminder.Fragments.TimePickerFragment timePickerFragment = new mndev.groupreminder.Fragments.TimePickerFragment();
    mndev.groupreminder.DataCache.getInstance().push(TimePickerFragment.TAG, timePicker);
    timePickerFragment.show(getActivity().getFragmentManager(), TimePickerFragment.TAG);
}