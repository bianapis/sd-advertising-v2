package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceAnalysis
 */
public class BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceAnalysis   {
  private String campaignDirectionInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return campaignDirectionInstanceAnalysisReference
  **/

  public String getCampaignDirectionInstanceAnalysisReference() {
    return campaignDirectionInstanceAnalysisReference;
  }

  public void setCampaignDirectionInstanceAnalysisReference(String campaignDirectionInstanceAnalysisReference) {
    this.campaignDirectionInstanceAnalysisReference = campaignDirectionInstanceAnalysisReference;
  }


}

