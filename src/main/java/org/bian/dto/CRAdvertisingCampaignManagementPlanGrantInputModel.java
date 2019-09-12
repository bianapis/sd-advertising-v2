package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanGrantInputModel
 */
public class CRAdvertisingCampaignManagementPlanGrantInputModel   {
  private String advertisingServicingSessionReference = null;

  private String advertisingCampaignManagementPlanInstanceReference = null;

  private Object advertisingCampaignManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRAdvertisingCampaignManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return advertisingServicingSessionReference
  **/

  public String getAdvertisingServicingSessionReference() {
    return advertisingServicingSessionReference;
  }

  public void setAdvertisingServicingSessionReference(String advertisingServicingSessionReference) {
    this.advertisingServicingSessionReference = advertisingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Advertising Campaign Management Plan instance 
   * @return advertisingCampaignManagementPlanInstanceReference
  **/

  public String getAdvertisingCampaignManagementPlanInstanceReference() {
    return advertisingCampaignManagementPlanInstanceReference;
  }

  public void setAdvertisingCampaignManagementPlanInstanceReference(String advertisingCampaignManagementPlanInstanceReference) {
    this.advertisingCampaignManagementPlanInstanceReference = advertisingCampaignManagementPlanInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRAdvertisingCampaignManagementPlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRAdvertisingCampaignManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

