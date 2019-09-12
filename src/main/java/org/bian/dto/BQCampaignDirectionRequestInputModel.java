package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionRequestInputModel
 */
public class BQCampaignDirectionRequestInputModel   {
  private String advertisingCampaignManagementPlanInstanceReference = null;

  private String campaignDirectionInstanceReference = null;

  private BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord = null;

  private Object campaignDirectionRequestActionTaskRecord = null;

  private CRAdvertisingCampaignManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Campaign Direction instance 
   * @return campaignDirectionInstanceReference
  **/

  public String getCampaignDirectionInstanceReference() {
    return campaignDirectionInstanceReference;
  }

  public void setCampaignDirectionInstanceReference(String campaignDirectionInstanceReference) {
    this.campaignDirectionInstanceReference = campaignDirectionInstanceReference;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return campaignDirectionRequestActionTaskRecord
  **/

  public Object getCampaignDirectionRequestActionTaskRecord() {
    return campaignDirectionRequestActionTaskRecord;
  }

  public void setCampaignDirectionRequestActionTaskRecord(Object campaignDirectionRequestActionTaskRecord) {
    this.campaignDirectionRequestActionTaskRecord = campaignDirectionRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRAdvertisingCampaignManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRAdvertisingCampaignManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

