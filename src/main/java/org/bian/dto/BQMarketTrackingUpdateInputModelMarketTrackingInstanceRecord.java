package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecordMarketTrackingWorkTask;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecord
 */
public class BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecord   {
  private String marketTrackingWorkTaskType = null;

  private BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecordMarketTrackingWorkTask marketTrackingWorkTask = null;

  private String marketTrackingWorkTaskWorkProducts = null;

  private String marketTrackingWorkTaskResult = null;

  private String marketTrackingWorkTaskDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. track advertising activity, assess advertising impact) 
   * @return marketTrackingWorkTaskType
  **/

  public String getMarketTrackingWorkTaskType() {
    return marketTrackingWorkTaskType;
  }

  public void setMarketTrackingWorkTaskType(String marketTrackingWorkTaskType) {
    this.marketTrackingWorkTaskType = marketTrackingWorkTaskType;
  }


  /**
   * Get marketTrackingWorkTask
   * @return marketTrackingWorkTask
  **/

  public BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecordMarketTrackingWorkTask getMarketTrackingWorkTask() {
    return marketTrackingWorkTask;
  }

  public void setMarketTrackingWorkTask(BQMarketTrackingUpdateInputModelMarketTrackingInstanceRecordMarketTrackingWorkTask marketTrackingWorkTask) {
    this.marketTrackingWorkTask = marketTrackingWorkTask;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, evaluations and findings for the market tracking work task 
   * @return marketTrackingWorkTaskWorkProducts
  **/

  public String getMarketTrackingWorkTaskWorkProducts() {
    return marketTrackingWorkTaskWorkProducts;
  }

  public void setMarketTrackingWorkTaskWorkProducts(String marketTrackingWorkTaskWorkProducts) {
    this.marketTrackingWorkTaskWorkProducts = marketTrackingWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the outcome or result of the work task - typically points of view drawn from the market research 
   * @return marketTrackingWorkTaskResult
  **/

  public String getMarketTrackingWorkTaskResult() {
    return marketTrackingWorkTaskResult;
  }

  public void setMarketTrackingWorkTaskResult(String marketTrackingWorkTaskResult) {
    this.marketTrackingWorkTaskResult = marketTrackingWorkTaskResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date-time the market tracking task is performed 
   * @return marketTrackingWorkTaskDateTime
  **/

  public String getMarketTrackingWorkTaskDateTime() {
    return marketTrackingWorkTaskDateTime;
  }

  public void setMarketTrackingWorkTaskDateTime(String marketTrackingWorkTaskDateTime) {
    this.marketTrackingWorkTaskDateTime = marketTrackingWorkTaskDateTime;
  }


}

