/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AdvertisingApiService {

	SDAdvertisingActivateOutputModel activate(SDAdvertisingActivateInputModel request);
	
	SDAdvertisingConfigureOutputModel configure(String sdReferenceId, SDAdvertisingConfigureInputModel request);
	
	CRAdvertisingCampaignManagementPlanCreateOutputModel create(String sdReferenceId, CRAdvertisingCampaignManagementPlanCreateInputModel request);
	
	BQCampaignDirectionCreateOutputModel createCampaigndirection(String sdReferenceId, String crReferenceId, BQCampaignDirectionCreateInputModel request);
	
	BQPerformanceAssessmentCreateOutputModel createPerformanceassessment(String sdReferenceId, String crReferenceId, BQPerformanceAssessmentCreateInputModel request);
	
	BQMarketTrackingExecuteOutputModel executeMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingExecuteInputModel request);
	
	BQPerformanceAssessmentExecuteOutputModel executePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentExecuteInputModel request);
	
	SDAdvertisingFeedbackOutputModel feedback(String sdReferenceId, SDAdvertisingFeedbackInputModel request);
	
	CRAdvertisingCampaignManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRAdvertisingCampaignManagementPlanGrantInputModel request);
	
	BQCampaignDirectionRequestOutputModel requestCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionRequestInputModel request);
	
	BQMarketTrackingRequestOutputModel requestMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingRequestInputModel request);
	
	BQPerformanceAssessmentRequestOutputModel requestPerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentRequestInputModel request);
	
	CRAdvertisingCampaignManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRAdvertisingCampaignManagementPlanRequestInputModel request);
	
	CRAdvertisingCampaignManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQCampaignDirectionRetrieveOutputModel retrieveCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMarketTrackingRetrieveOutputModel retrieveMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPerformanceAssessmentRetrieveOutputModel retrievePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDAdvertisingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRAdvertisingCampaignManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRAdvertisingCampaignManagementPlanUpdateInputModel request);
	
	BQCampaignDirectionUpdateOutputModel updateCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionUpdateInputModel request);
	
	BQMarketTrackingUpdateOutputModel updateMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingUpdateInputModel request);
	
	BQPerformanceAssessmentUpdateOutputModel updatePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentUpdateInputModel request);
	
}
