package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceAnalysis;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanRetrieveInputModel
 */
public class CRAdvertisingCampaignManagementPlanRetrieveInputModel   {
  private Object advertisingCampaignManagementPlanRetrieveActionTaskRecord = null;

  private String advertisingCampaignManagementPlanRetrieveActionRequest = null;

  private CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceReportRecord advertisingCampaignManagementPlanInstanceReportRecord = null;

  private CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceAnalysis advertisingCampaignManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return advertisingCampaignManagementPlanRetrieveActionTaskRecord
  **/

  public Object getAdvertisingCampaignManagementPlanRetrieveActionTaskRecord() {
    return advertisingCampaignManagementPlanRetrieveActionTaskRecord;
  }

  public void setAdvertisingCampaignManagementPlanRetrieveActionTaskRecord(Object advertisingCampaignManagementPlanRetrieveActionTaskRecord) {
    this.advertisingCampaignManagementPlanRetrieveActionTaskRecord = advertisingCampaignManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return advertisingCampaignManagementPlanRetrieveActionRequest
  **/

  public String getAdvertisingCampaignManagementPlanRetrieveActionRequest() {
    return advertisingCampaignManagementPlanRetrieveActionRequest;
  }

  public void setAdvertisingCampaignManagementPlanRetrieveActionRequest(String advertisingCampaignManagementPlanRetrieveActionRequest) {
    this.advertisingCampaignManagementPlanRetrieveActionRequest = advertisingCampaignManagementPlanRetrieveActionRequest;
  }


  /**
   * Get advertisingCampaignManagementPlanInstanceReportRecord
   * @return advertisingCampaignManagementPlanInstanceReportRecord
  **/

  public CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceReportRecord getAdvertisingCampaignManagementPlanInstanceReportRecord() {
    return advertisingCampaignManagementPlanInstanceReportRecord;
  }

  public void setAdvertisingCampaignManagementPlanInstanceReportRecord(CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceReportRecord advertisingCampaignManagementPlanInstanceReportRecord) {
    this.advertisingCampaignManagementPlanInstanceReportRecord = advertisingCampaignManagementPlanInstanceReportRecord;
  }


  /**
   * Get advertisingCampaignManagementPlanInstanceAnalysis
   * @return advertisingCampaignManagementPlanInstanceAnalysis
  **/

  public CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceAnalysis getAdvertisingCampaignManagementPlanInstanceAnalysis() {
    return advertisingCampaignManagementPlanInstanceAnalysis;
  }

  public void setAdvertisingCampaignManagementPlanInstanceAnalysis(CRAdvertisingCampaignManagementPlanRetrieveInputModelAdvertisingCampaignManagementPlanInstanceAnalysis advertisingCampaignManagementPlanInstanceAnalysis) {
    this.advertisingCampaignManagementPlanInstanceAnalysis = advertisingCampaignManagementPlanInstanceAnalysis;
  }


}

