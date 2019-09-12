package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanUpdateOutputModel
 */
public class CRAdvertisingCampaignManagementPlanUpdateOutputModel   {
  private CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio = null;

  private String advertisingCampaignManagementPlanUpdateActionTaskReference = null;

  private Object advertisingCampaignManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return advertisingCampaignManagementPlanUpdateActionTaskReference
  **/

  public String getAdvertisingCampaignManagementPlanUpdateActionTaskReference() {
    return advertisingCampaignManagementPlanUpdateActionTaskReference;
  }

  public void setAdvertisingCampaignManagementPlanUpdateActionTaskReference(String advertisingCampaignManagementPlanUpdateActionTaskReference) {
    this.advertisingCampaignManagementPlanUpdateActionTaskReference = advertisingCampaignManagementPlanUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

