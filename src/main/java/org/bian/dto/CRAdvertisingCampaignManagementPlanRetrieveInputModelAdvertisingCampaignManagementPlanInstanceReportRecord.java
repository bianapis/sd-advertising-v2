package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceReportRecord
 */
public class CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceReportRecord   {
  private String advertisingCampaignManagementPlanInstanceReportReference = null;

  private String advertisingCampaignManagementPlanInstanceReportType = null;

  private String advertisingCampaignManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return advertisingCampaignManagementPlanInstanceReportReference
  **/

  public String getAdvertisingCampaignManagementPlanInstanceReportReference() {
    return advertisingCampaignManagementPlanInstanceReportReference;
  }

  public void setAdvertisingCampaignManagementPlanInstanceReportReference(String advertisingCampaignManagementPlanInstanceReportReference) {
    this.advertisingCampaignManagementPlanInstanceReportReference = advertisingCampaignManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return advertisingCampaignManagementPlanInstanceReportType
  **/

  public String getAdvertisingCampaignManagementPlanInstanceReportType() {
    return advertisingCampaignManagementPlanInstanceReportType;
  }

  public void setAdvertisingCampaignManagementPlanInstanceReportType(String advertisingCampaignManagementPlanInstanceReportType) {
    this.advertisingCampaignManagementPlanInstanceReportType = advertisingCampaignManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return advertisingCampaignManagementPlanInstanceReportParameters
  **/

  public String getAdvertisingCampaignManagementPlanInstanceReportParameters() {
    return advertisingCampaignManagementPlanInstanceReportParameters;
  }

  public void setAdvertisingCampaignManagementPlanInstanceReportParameters(String advertisingCampaignManagementPlanInstanceReportParameters) {
    this.advertisingCampaignManagementPlanInstanceReportParameters = advertisingCampaignManagementPlanInstanceReportParameters;
  }


}

