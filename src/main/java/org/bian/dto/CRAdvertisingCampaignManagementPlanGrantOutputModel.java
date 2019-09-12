package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanGrantOutputModel
 */
public class CRAdvertisingCampaignManagementPlanGrantOutputModel   {
  private String advertisingCampaignManagementPlanGrantActionTaskReference = null;

  private Object advertisingCampaignManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRAdvertisingCampaignManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Advertising Campaign Management Plan instance grant service call 
   * @return advertisingCampaignManagementPlanGrantActionTaskReference
  **/

  public String getAdvertisingCampaignManagementPlanGrantActionTaskReference() {
    return advertisingCampaignManagementPlanGrantActionTaskReference;
  }

  public void setAdvertisingCampaignManagementPlanGrantActionTaskReference(String advertisingCampaignManagementPlanGrantActionTaskReference) {
    this.advertisingCampaignManagementPlanGrantActionTaskReference = advertisingCampaignManagementPlanGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return advertisingCampaignManagementPlanGrantActionTaskRecord
  **/

  public Object getAdvertisingCampaignManagementPlanGrantActionTaskRecord() {
    return advertisingCampaignManagementPlanGrantActionTaskRecord;
  }

  public void setAdvertisingCampaignManagementPlanGrantActionTaskRecord(Object advertisingCampaignManagementPlanGrantActionTaskRecord) {
    this.advertisingCampaignManagementPlanGrantActionTaskRecord = advertisingCampaignManagementPlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRAdvertisingCampaignManagementPlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRAdvertisingCampaignManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

