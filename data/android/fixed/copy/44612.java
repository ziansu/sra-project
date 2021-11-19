@java.lang.Override
public int compare(com.gelakinetic.mtgfam.helpers.DecklistHelpers.CompressedDecklistInfo card1, com.gelakinetic.mtgfam.helpers.DecklistHelpers.CompressedDecklistInfo card2) {
    if ((card1.mIsSideboard) == (card2.mIsSideboard)) {
        return 0;
    }else
        if (card1.mIsSideboard) {
            return 1;
        }
    
    return -1;
}