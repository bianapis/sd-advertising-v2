package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionCreateInputModel
 */
public class BQCampaignDirectionCreateInputModel   {
  private String advertisingCampaignManagementPlanInstanceReference = null;

  private Object campaignDirectionInitiateActionRecord = null;

  private BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Advertising Campaign Management Plan instance 
   * @return advertisingCampaignManagementPlanInstanceReference
  **/

  public String getAdvertisingCampaignManagementPlanInstanceReference() {
    return advertisingCampaignManagementPlanInstanceReference;
  }

  public void setAdvertisingCampaignManagementPlanInstanceReference(String advertisingCampaignManagementPlanInstanceReference) {
    this.advertisingCampaignManagementPlanInstanceReference = advertisingCampaignManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return campaignDirectionInitiateActionRecord
  **/

  public Object getCampaignDirectionInitiateActionRecord() {
    return campaignDirectionInitiateActionRecord;
  }

  public void setCampaignDirectionInitiateActionRecord(Object campaignDirectionInitiateActionRecord) {
    this.campaignDirectionInitiateActionRecord = campaignDirectionInitiateActionRecord;
  }


  /**
   * Get campaignDirectionInstanceRecord
   * @return campaignDirectionInstanceRecord
  **/

  public BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord getCampaignDirectionInstanceRecord() {
    return campaignDirectionInstanceRecord;
  }

  public void setCampaignDirectionInstanceRecord(BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord) {
    this.campaignDirectionInstanceRecord = campaignDirectionInstanceRecord;
  }


}

