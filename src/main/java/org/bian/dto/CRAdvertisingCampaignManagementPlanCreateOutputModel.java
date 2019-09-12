package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanCreateOutputModelAdvertisingCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanCreateOutputModel
 */
public class CRAdvertisingCampaignManagementPlanCreateOutputModel   {
  private String advertisingCampaignManagementPlanInstanceReference = null;

  private String advertisingCampaignManagementPlanCreateActionReference = null;

  private Object advertisingCampaignManagementPlanCreateActionRecord = null;

  private String advertisingCampaignManagementPlanInstanceStatus = null;

  private CRAdvertisingCampaignManagementPlanCreateOutputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return advertisingCampaignManagementPlanCreateActionReference
  **/

  public String getAdvertisingCampaignManagementPlanCreateActionReference() {
    return advertisingCampaignManagementPlanCreateActionReference;
  }

  public void setAdvertisingCampaignManagementPlanCreateActionReference(String advertisingCampaignManagementPlanCreateActionReference) {
    this.advertisingCampaignManagementPlanCreateActionReference = advertisingCampaignManagementPlanCreateActionReference;
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

  public CRAdvertisingCampaignManagementPlanCreateOutputModelAdvertisingCampaignPortfolio getAdvertisingCampaignPortfolio() {
    return advertisingCampaignPortfolio;
  }

  public void setAdvertisingCampaignPortfolio(CRAdvertisingCampaignManagementPlanCreateOutputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio) {
    this.advertisingCampaignPortfolio = advertisingCampaignPortfolio;
  }


}

