package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceAnalysis
 */
public class CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceAnalysis   {
  private String advertisingCampaignManagementPlanInstanceAnalysisReference = null;

  private String advertisingCampaignManagementPlanInstanceAnalysisReportType = null;

  private String advertisingCampaignManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return advertisingCampaignManagementPlanInstanceAnalysisReference
  **/

  public String getAdvertisingCampaignManagementPlanInstanceAnalysisReference() {
    return advertisingCampaignManagementPlanInstanceAnalysisReference;
  }

  public void setAdvertisingCampaignManagementPlanInstanceAnalysisReference(String advertisingCampaignManagementPlanInstanceAnalysisReference) {
    this.advertisingCampaignManagementPlanInstanceAnalysisReference = advertisingCampaignManagementPlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return advertisingCampaignManagementPlanInstanceAnalysisReportType
  **/

  public String getAdvertisingCampaignManagementPlanInstanceAnalysisReportType() {
    return advertisingCampaignManagementPlanInstanceAnalysisReportType;
  }

  public void setAdvertisingCampaignManagementPlanInstanceAnalysisReportType(String advertisingCampaignManagementPlanInstanceAnalysisReportType) {
    this.advertisingCampaignManagementPlanInstanceAnalysisReportType = advertisingCampaignManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return advertisingCampaignManagementPlanInstanceAnalysisParameters
  **/

  public String getAdvertisingCampaignManagementPlanInstanceAnalysisParameters() {
    return advertisingCampaignManagementPlanInstanceAnalysisParameters;
  }

  public void setAdvertisingCampaignManagementPlanInstanceAnalysisParameters(String advertisingCampaignManagementPlanInstanceAnalysisParameters) {
    this.advertisingCampaignManagementPlanInstanceAnalysisParameters = advertisingCampaignManagementPlanInstanceAnalysisParameters;
  }


}

