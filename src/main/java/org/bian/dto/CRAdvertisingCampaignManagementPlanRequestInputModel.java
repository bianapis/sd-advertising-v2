package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRequestInputModelAdvertisingCampaignPortfolio;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanRequestInputModel
 */
public class CRAdvertisingCampaignManagementPlanRequestInputModel   {
  private String advertisingServicingSessionReference = null;

  private String advertisingCampaignManagementPlanInstanceReference = null;

  private CRAdvertisingCampaignManagementPlanRequestInputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio = null;

  private Object advertisingCampaignManagementPlanRequestActionTaskRecord = null;

  private CRAdvertisingCampaignManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get advertisingCampaignPortfolio
   * @return advertisingCampaignPortfolio
  **/

  public CRAdvertisingCampaignManagementPlanRequestInputModelAdvertisingCampaignPortfolio getAdvertisingCampaignPortfolio() {
    return advertisingCampaignPortfolio;
  }

  public void setAdvertisingCampaignPortfolio(CRAdvertisingCampaignManagementPlanRequestInputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio) {
    this.advertisingCampaignPortfolio = advertisingCampaignPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return advertisingCampaignManagementPlanRequestActionTaskRecord
  **/

  public Object getAdvertisingCampaignManagementPlanRequestActionTaskRecord() {
    return advertisingCampaignManagementPlanRequestActionTaskRecord;
  }

  public void setAdvertisingCampaignManagementPlanRequestActionTaskRecord(Object advertisingCampaignManagementPlanRequestActionTaskRecord) {
    this.advertisingCampaignManagementPlanRequestActionTaskRecord = advertisingCampaignManagementPlanRequestActionTaskRecord;
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

