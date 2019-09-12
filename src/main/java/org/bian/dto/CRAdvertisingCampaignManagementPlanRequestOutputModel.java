package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRequestInputModelAdvertisingCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanRequestOutputModel
 */
public class CRAdvertisingCampaignManagementPlanRequestOutputModel   {
  private CRAdvertisingCampaignManagementPlanRequestInputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio = null;

  private String advertisingCampaignManagementPlanRequestActionTaskReference = null;

  private Object advertisingCampaignManagementPlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Advertising Campaign Management Plan instance request service call 
   * @return advertisingCampaignManagementPlanRequestActionTaskReference
  **/

  public String getAdvertisingCampaignManagementPlanRequestActionTaskReference() {
    return advertisingCampaignManagementPlanRequestActionTaskReference;
  }

  public void setAdvertisingCampaignManagementPlanRequestActionTaskReference(String advertisingCampaignManagementPlanRequestActionTaskReference) {
    this.advertisingCampaignManagementPlanRequestActionTaskReference = advertisingCampaignManagementPlanRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

