package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignManagementPlanInstanceAnalysis;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignManagementPlanInstanceReportRecord;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanRetrieveOutputModel
 */
public class CRAdvertisingCampaignManagementPlanRetrieveOutputModel   {
  private CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio = null;

  private String advertisingCampaignManagementPlanRetrieveActionTaskReference = null;

  private Object advertisingCampaignManagementPlanRetrieveActionTaskRecord = null;

  private String advertisingCampaignManagementPlanRetrieveActionResponse = null;

  private CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignManagementPlanInstanceReportRecord advertisingCampaignManagementPlanInstanceReportRecord = null;

  private CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignManagementPlanInstanceAnalysis advertisingCampaignManagementPlanInstanceAnalysis = null;


  /**
   * Get advertisingCampaignPortfolio
   * @return advertisingCampaignPortfolio
  **/

  public CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignPortfolio getAdvertisingCampaignPortfolio() {
    return advertisingCampaignPortfolio;
  }

  public void setAdvertisingCampaignPortfolio(CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignPortfolio advertisingCampaignPortfolio) {
    this.advertisingCampaignPortfolio = advertisingCampaignPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Advertising Campaign Management Plan instance retrieve service call 
   * @return advertisingCampaignManagementPlanRetrieveActionTaskReference
  **/

  public String getAdvertisingCampaignManagementPlanRetrieveActionTaskReference() {
    return advertisingCampaignManagementPlanRetrieveActionTaskReference;
  }

  public void setAdvertisingCampaignManagementPlanRetrieveActionTaskReference(String advertisingCampaignManagementPlanRetrieveActionTaskReference) {
    this.advertisingCampaignManagementPlanRetrieveActionTaskReference = advertisingCampaignManagementPlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return advertisingCampaignManagementPlanRetrieveActionResponse
  **/

  public String getAdvertisingCampaignManagementPlanRetrieveActionResponse() {
    return advertisingCampaignManagementPlanRetrieveActionResponse;
  }

  public void setAdvertisingCampaignManagementPlanRetrieveActionResponse(String advertisingCampaignManagementPlanRetrieveActionResponse) {
    this.advertisingCampaignManagementPlanRetrieveActionResponse = advertisingCampaignManagementPlanRetrieveActionResponse;
  }


  /**
   * Get advertisingCampaignManagementPlanInstanceReportRecord
   * @return advertisingCampaignManagementPlanInstanceReportRecord
  **/

  public CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignManagementPlanInstanceReportRecord getAdvertisingCampaignManagementPlanInstanceReportRecord() {
    return advertisingCampaignManagementPlanInstanceReportRecord;
  }

  public void setAdvertisingCampaignManagementPlanInstanceReportRecord(CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignManagementPlanInstanceReportRecord advertisingCampaignManagementPlanInstanceReportRecord) {
    this.advertisingCampaignManagementPlanInstanceReportRecord = advertisingCampaignManagementPlanInstanceReportRecord;
  }


  /**
   * Get advertisingCampaignManagementPlanInstanceAnalysis
   * @return advertisingCampaignManagementPlanInstanceAnalysis
  **/

  public CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignManagementPlanInstanceAnalysis getAdvertisingCampaignManagementPlanInstanceAnalysis() {
    return advertisingCampaignManagementPlanInstanceAnalysis;
  }

  public void setAdvertisingCampaignManagementPlanInstanceAnalysis(CRAdvertisingCampaignManagementPlanRetrieveOutputModelAdvertisingCampaignManagementPlanInstanceAnalysis advertisingCampaignManagementPlanInstanceAnalysis) {
    this.advertisingCampaignManagementPlanInstanceAnalysis = advertisingCampaignManagementPlanInstanceAnalysis;
  }


}

