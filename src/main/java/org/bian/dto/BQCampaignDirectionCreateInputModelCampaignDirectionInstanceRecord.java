package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord
 */
public class BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord   {
  private String advertisingCampaignDevelopmentSchedule = null;

  private String advertisingCampaignExecutionSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule of planned and actual advertising campaign design development and refinement activity 
   * @return advertisingCampaignDevelopmentSchedule
  **/

  public String getAdvertisingCampaignDevelopmentSchedule() {
    return advertisingCampaignDevelopmentSchedule;
  }

  public void setAdvertisingCampaignDevelopmentSchedule(String advertisingCampaignDevelopmentSchedule) {
    this.advertisingCampaignDevelopmentSchedule = advertisingCampaignDevelopmentSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule of planned and actual customer campaign execution activities 
   * @return advertisingCampaignExecutionSchedule
  **/

  public String getAdvertisingCampaignExecutionSchedule() {
    return advertisingCampaignExecutionSchedule;
  }

  public void setAdvertisingCampaignExecutionSchedule(String advertisingCampaignExecutionSchedule) {
    this.advertisingCampaignExecutionSchedule = advertisingCampaignExecutionSchedule;
  }


}

