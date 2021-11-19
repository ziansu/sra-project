@java.lang.Override
public int getCampaignsCountInType(int campaignType) {
    com.edu.timebank.service.business.impl.CampaignEntityExample example = new com.edu.timebank.service.business.impl.CampaignEntityExample();
    example.createCriteria().andCampaignTypeEqualTo(campaignType);
    return campaignEntityMapper.countByExample(example);
}