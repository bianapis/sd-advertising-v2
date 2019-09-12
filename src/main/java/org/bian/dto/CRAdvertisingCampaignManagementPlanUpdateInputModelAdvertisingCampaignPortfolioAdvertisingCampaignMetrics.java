package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignMetrics
 */
public class CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignMetrics   {
  private String advertisingCampaignMetricDefinition = null;

  private String advertisingCampaignMetricGoal = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the metric, defining how it is to be measured in deployment 
   * @return advertisingCampaignMetricDefinition
  **/

  public String getAdvertisingCampaignMetricDefinition() {
    return advertisingCampaignMetricDefinition;
  }

  public void setAdvertisingCampaignMetricDefinition(String advertisingCampaignMetricDefinition) {
    this.advertisingCampaignMetricDefinition = advertisingCampaignMetricDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the target performance for the metric that can be defined for different usage scenarios as appropriate 
   * @return advertisingCampaignMetricGoal
  **/

  public String getAdvertisingCampaignMetricGoal() {
    return advertisingCampaignMetricGoal;
  }

  public void setAdvertisingCampaignMetricGoal(String advertisingCampaignMetricGoal) {
    this.advertisingCampaignMetricGoal = advertisingCampaignMetricGoal;
  }


}

