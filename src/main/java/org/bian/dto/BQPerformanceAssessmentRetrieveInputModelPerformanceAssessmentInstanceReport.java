package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceReport
 */
public class BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceReport   {
  private String performanceAssessmentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return performanceAssessmentInstanceReportReference
  **/

  public String getPerformanceAssessmentInstanceReportReference() {
    return performanceAssessmentInstanceReportReference;
  }

  public void setPerformanceAssessmentInstanceReportReference(String performanceAssessmentInstanceReportReference) {
    this.performanceAssessmentInstanceReportReference = performanceAssessmentInstanceReportReference;
  }


}

