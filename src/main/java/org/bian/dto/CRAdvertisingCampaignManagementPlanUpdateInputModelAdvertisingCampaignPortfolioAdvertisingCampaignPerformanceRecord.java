package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecordAdvertisingCampaignProcedureInstanceReference;

import javax.validation.Valid;
  
/**
 * CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecord
 */
public class CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecord   {
  private CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecordAdvertisingCampaignProcedureInstanceReference advertisingCampaignProcedureInstanceReference = null;


  /**
   * Get advertisingCampaignProcedureInstanceReference
   * @return advertisingCampaignProcedureInstanceReference
  **/

  public CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecordAdvertisingCampaignProcedureInstanceReference getAdvertisingCampaignProcedureInstanceReference() {
    return advertisingCampaignProcedureInstanceReference;
  }

  public void setAdvertisingCampaignProcedureInstanceReference(CRAdvertisingCampaignManagementPlanUpdateInputModelAdvertisingCampaignPortfolioAdvertisingCampaignPerformanceRecordAdvertisingCampaignProcedureInstanceReference advertisingCampaignProcedureInstanceReference) {
    this.advertisingCampaignProcedureInstanceReference = advertisingCampaignProcedureInstanceReference;
  }


}

