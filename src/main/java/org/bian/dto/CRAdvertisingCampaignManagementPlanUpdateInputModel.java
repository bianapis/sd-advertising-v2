package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanUpdateInputModel
 */
public class CRAdvertisingCampaignManagementPlanUpdateInputModel   {
  private String advertisingServicingSessionReference = null;

  private String advertisingCampaignManagementPlanInstanceReference = null;

  private CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio = null;

  private Object advertisingCampaignManagementPlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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

  public CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolio getAdvertisingCampaignPortfolio() {
    return advertisingCampaignPortfolio;
  }

  public void setAdvertisingCampaignPortfolio(CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio) {
    this.advertisingCampaignPortfolio = advertisingCampaignPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return advertisingCampaignManagementPlanUpdateActionTaskRecord
  **/

  public Object getAdvertisingCampaignManagementPlanUpdateActionTaskRecord() {
    return advertisingCampaignManagementPlanUpdateActionTaskRecord;
  }

  public void setAdvertisingCampaignManagementPlanUpdateActionTaskRecord(Object advertisingCampaignManagementPlanUpdateActionTaskRecord) {
    this.advertisingCampaignManagementPlanUpdateActionTaskRecord = advertisingCampaignManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

