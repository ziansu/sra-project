@java.lang.Override
public int getCampaignsCountInType(int campaignType) {
    com.edu.timebank.service.business.impl.CampaignEntityExample example = new com.edu.timebank.service.business.impl.CampaignEntityExample();
    if (campaignType != 0) {
        example.createCriteria().andCampaignTypeEqualTo(campaignType);
    }
    return campaignEntityMapper.countByExample(example);
}