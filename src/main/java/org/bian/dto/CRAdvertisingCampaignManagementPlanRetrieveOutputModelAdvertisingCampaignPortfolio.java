package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecord;
import org.bian.dto.CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignMetrics;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignPortfolio
 */
public class CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignPortfolio   {
  private String advertisingCampaignType = null;

  private String advertisingCampaignDescription = null;

  private CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignMetrics advertisingCampaignMetrics = null;

  private CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecord advertisingCampaignPerformanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of advertising campaign (e.g. media, mailshot, web-based) 
   * @return advertisingCampaignType
  **/

  public String getAdvertisingCampaignType() {
    return advertisingCampaignType;
  }

  public void setAdvertisingCampaignType(String advertisingCampaignType) {
    this.advertisingCampaignType = advertisingCampaignType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the campaign that clarifies the content and media to be used in the advertising campaign and outlines the target audience 
   * @return advertisingCampaignDescription
  **/

  public String getAdvertisingCampaignDescription() {
    return advertisingCampaignDescription;
  }

  public void setAdvertisingCampaignDescription(String advertisingCampaignDescription) {
    this.advertisingCampaignDescription = advertisingCampaignDescription;
  }


  /**
   * Get advertisingCampaignMetrics
   * @return advertisingCampaignMetrics
  **/

  public CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignMetrics getAdvertisingCampaignMetrics() {
    return advertisingCampaignMetrics;
  }

  public void setAdvertisingCampaignMetrics(CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignMetrics advertisingCampaignMetrics) {
    this.advertisingCampaignMetrics = advertisingCampaignMetrics;
  }


  /**
   * Get advertisingCampaignPerformanceRecord
   * @return advertisingCampaignPerformanceRecord
  **/

  public CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecord getAdvertisingCampaignPerformanceRecord() {
    return advertisingCampaignPerformanceRecord;
  }

  public void setAdvertisingCampaignPerformanceRecord(CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecord advertisingCampaignPerformanceRecord) {
    this.advertisingCampaignPerformanceRecord = advertisingCampaignPerformanceRecord;
  }


}

