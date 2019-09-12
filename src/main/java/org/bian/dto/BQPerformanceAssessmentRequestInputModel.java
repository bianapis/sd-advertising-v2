package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord;
import org.bian.dto.CRAdvertisingCampaignManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentRequestInputModel
 */
public class BQPerformanceAssessmentRequestInputModel   {
  private String advertisingCampaignManagementPlanInstanceReference = null;

  private String performanceAssessmentInstanceReference = null;

  private BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord = null;

  private Object performanceAssessmentRequestActionTaskRecord = null;

  private CRAdvertisingCampaignManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Advertising Campaign Management Plan instance 
   * @return advertisingCampaignManagementPlanInstanceReference
  **/

  public String getAdvertisingCampaignManagementPlanInstanceReference() {
    return advertisingCampaignManagementPlanInstanceReference;
  }

  public void setAdvertisingCampaignManagementPlanInstanceReference(String advertisingCampaignManagementPlanInstanceReference) {
    this.advertisingCampaignManagementPlanInstanceReference = advertisingCampaignManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance Assessment instance 
   * @return performanceAssessmentInstanceReference
  **/

  public String getPerformanceAssessmentInstanceReference() {
    return performanceAssessmentInstanceReference;
  }

  public void setPerformanceAssessmentInstanceReference(String performanceAssessmentInstanceReference) {
    this.performanceAssessmentInstanceReference = performanceAssessmentInstanceReference;
  }


  /**
   * Get performanceAssessmentInstanceRecord
   * @return performanceAssessmentInstanceRecord
  **/

  public BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord getPerformanceAssessmentInstanceRecord() {
    return performanceAssessmentInstanceRecord;
  }

  public void setPerformanceAssessmentInstanceRecord(BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord) {
    this.performanceAssessmentInstanceRecord = performanceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return performanceAssessmentRequestActionTaskRecord
  **/

  public Object getPerformanceAssessmentRequestActionTaskRecord() {
    return performanceAssessmentRequestActionTaskRecord;
  }

  public void setPerformanceAssessmentRequestActionTaskRecord(Object performanceAssessmentRequestActionTaskRecord) {
    this.performanceAssessmentRequestActionTaskRecord = performanceAssessmentRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRAdvertisingCampaignManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRAdvertisingCampaignManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

