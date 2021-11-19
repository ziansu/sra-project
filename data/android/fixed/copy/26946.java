@java.lang.Override
public int getItemViewType(int position) {
    if (position == 0)
        return de.oerntec.votenote.SubjectManagerStuff.SubjectCreation.CreationFragment.UnifiedCreatorAdapter.VIEW_INFO;
    else
        if (position <= (mCounterData.size()))
            return de.oerntec.votenote.SubjectManagerStuff.SubjectCreation.CreationFragment.UnifiedCreatorAdapter.VIEW_COUNTER;
        else
            return de.oerntec.votenote.SubjectManagerStuff.SubjectCreation.CreationFragment.UnifiedCreatorAdapter.VIEW_PERCENTAGE;
        
    
}