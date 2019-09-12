package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanCreateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignMetrics;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanRequestInputModelAdvertisingCampaignPortfolio
 */
public class CRAdvertisingCampaignManagementPlanRequestInputModelAdvertisingCampaignPortfolio   {
  private String advertisingCampaignType = null;

  private String advertisingCampaignDescription = null;

  private CRAdvertisingCampaignManagementPlanCreateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignMetrics advertisingCampaignMetrics = null;


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

  public CRAdvertisingCampaignManagementPlanCreateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignMetrics getAdvertisingCampaignMetrics() {
    return advertisingCampaignMetrics;
  }

  public void setAdvertisingCampaignMetrics(CRAdvertisingCampaignManagementPlanCreateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignMetrics advertisingCampaignMetrics) {
    this.advertisingCampaignMetrics = advertisingCampaignMetrics;
  }


}

