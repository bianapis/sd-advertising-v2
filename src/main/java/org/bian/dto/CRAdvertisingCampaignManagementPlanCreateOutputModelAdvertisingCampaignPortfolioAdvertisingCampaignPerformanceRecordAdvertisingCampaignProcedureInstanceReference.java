package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanCreateOutputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecordAdvertisingCampaignProcedureInstanceReference
 */
public class CRAdvertisingCampaignManagementPlanCreateOutputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecordAdvertisingCampaignProcedureInstanceReference   {
  private String advertisingCampaignExecutionPlan = null;

  private String employeeBusinessUnitReference = null;

  private String advertisingCampaignDuration = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The execution plan for the advertising campaign, including external agencies employed, content development and execution tasks 
   * @return advertisingCampaignExecutionPlan
  **/

  public String getAdvertisingCampaignExecutionPlan() {
    return advertisingCampaignExecutionPlan;
  }

  public void setAdvertisingCampaignExecutionPlan(String advertisingCampaignExecutionPlan) {
    this.advertisingCampaignExecutionPlan = advertisingCampaignExecutionPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for the campaign execution 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The period over which the advertising is executed 
   * @return advertisingCampaignDuration
  **/

  public String getAdvertisingCampaignDuration() {
    return advertisingCampaignDuration;
  }

  public void setAdvertisingCampaignDuration(String advertisingCampaignDuration) {
    this.advertisingCampaignDuration = advertisingCampaignDuration;
  }


}

