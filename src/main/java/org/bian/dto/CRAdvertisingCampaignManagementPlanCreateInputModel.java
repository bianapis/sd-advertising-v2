package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanCreateInputModelAdvertisingCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanCreateInputModel
 */
public class CRAdvertisingCampaignManagementPlanCreateInputModel   {
  private String advertisingServicingSessionReference = null;

  private Object advertisingCampaignManagementPlanCreateActionRecord = null;

  private String advertisingCampaignManagementPlanInstanceStatus = null;

  private CRAdvertisingCampaignManagementPlanCreateInputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return advertisingCampaignManagementPlanCreateActionRecord
  **/

  public Object getAdvertisingCampaignManagementPlanCreateActionRecord() {
    return advertisingCampaignManagementPlanCreateActionRecord;
  }

  public void setAdvertisingCampaignManagementPlanCreateActionRecord(Object advertisingCampaignManagementPlanCreateActionRecord) {
    this.advertisingCampaignManagementPlanCreateActionRecord = advertisingCampaignManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Advertising Campaign Management Plan instance (e.g. initialised, pending, active) 
   * @return advertisingCampaignManagementPlanInstanceStatus
  **/

  public String getAdvertisingCampaignManagementPlanInstanceStatus() {
    return advertisingCampaignManagementPlanInstanceStatus;
  }

  public void setAdvertisingCampaignManagementPlanInstanceStatus(String advertisingCampaignManagementPlanInstanceStatus) {
    this.advertisingCampaignManagementPlanInstanceStatus = advertisingCampaignManagementPlanInstanceStatus;
  }


  /**
   * Get advertisingCampaignPortfolio
   * @return advertisingCampaignPortfolio
  **/

  public CRAdvertisingCampaignManagementPlanCreateInputModelAdvertisingCampaignPortfolio getAdvertisingCampaignPortfolio() {
    return advertisingCampaignPortfolio;
  }

  public void setAdvertisingCampaignPortfolio(CRAdvertisingCampaignManagementPlanCreateInputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio) {
    this.advertisingCampaignPortfolio = advertisingCampaignPortfolio;
  }


}

