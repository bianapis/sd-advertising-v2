package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignManagementPlanInstanceAnalysis
 */
public class CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignManagementPlanInstanceAnalysis   {
  private String advertisingCampaignManagementPlanInstanceAnalysisData = null;

  private String advertisingCampaignManagementPlanInstanceAnalysisReportType = null;

  private Object advertisingCampaignManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return advertisingCampaignManagementPlanInstanceAnalysisData
  **/

  public String getAdvertisingCampaignManagementPlanInstanceAnalysisData() {
    return advertisingCampaignManagementPlanInstanceAnalysisData;
  }

  public void setAdvertisingCampaignManagementPlanInstanceAnalysisData(String advertisingCampaignManagementPlanInstanceAnalysisData) {
    this.advertisingCampaignManagementPlanInstanceAnalysisData = advertisingCampaignManagementPlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return advertisingCampaignManagementPlanInstanceAnalysisReport
  **/

  public Object getAdvertisingCampaignManagementPlanInstanceAnalysisReport() {
    return advertisingCampaignManagementPlanInstanceAnalysisReport;
  }

  public void setAdvertisingCampaignManagementPlanInstanceAnalysisReport(Object advertisingCampaignManagementPlanInstanceAnalysisReport) {
    this.advertisingCampaignManagementPlanInstanceAnalysisReport = advertisingCampaignManagementPlanInstanceAnalysisReport;
  }


}

