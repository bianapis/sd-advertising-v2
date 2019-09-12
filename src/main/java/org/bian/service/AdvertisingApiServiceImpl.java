/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class AdvertisingApiServiceImpl implements AdvertisingApiService {

	public SDAdvertisingActivateOutputModel activate(SDAdvertisingActivateInputModel request){
		return JsonReader.read("activate-SDAdvertisingActivateOutputModel.json",new TypeReference<SDAdvertisingActivateOutputModel>(){});
	}
	
	public SDAdvertisingConfigureOutputModel configure(String sdReferenceId, SDAdvertisingConfigureInputModel request){
		return JsonReader.read("configure-SDAdvertisingConfigureOutputModel.json",new TypeReference<SDAdvertisingConfigureOutputModel>(){});
	}
	
	public CRAdvertisingCampaignManagementPlanCreateOutputModel create(String sdReferenceId, CRAdvertisingCampaignManagementPlanCreateInputModel request){
		return JsonReader.read("create-CRAdvertisingCampaignManagementPlanCreateOutputModel.json",new TypeReference<CRAdvertisingCampaignManagementPlanCreateOutputModel>(){});
	}
	
	public BQCampaignDirectionCreateOutputModel createCampaigndirection(String sdReferenceId, String crReferenceId, BQCampaignDirectionCreateInputModel request){
		return JsonReader.read("create-BQCampaignDirectionCreateOutputModel.json",new TypeReference<BQCampaignDirectionCreateOutputModel>(){});
	}
	
	public BQPerformanceAssessmentCreateOutputModel createPerformanceassessment(String sdReferenceId, String crReferenceId, BQPerformanceAssessmentCreateInputModel request){
		return JsonReader.read("create-BQPerformanceAssessmentCreateOutputModel.json",new TypeReference<BQPerformanceAssessmentCreateOutputModel>(){});
	}
	
	public BQMarketTrackingExecuteOutputModel executeMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingExecuteInputModel request){
		return JsonReader.read("execute-BQMarketTrackingExecuteOutputModel.json",new TypeReference<BQMarketTrackingExecuteOutputModel>(){});
	}
	
	public BQPerformanceAssessmentExecuteOutputModel executePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentExecuteInputModel request){
		return JsonReader.read("execute-BQPerformanceAssessmentExecuteOutputModel.json",new TypeReference<BQPerformanceAssessmentExecuteOutputModel>(){});
	}
	
	public SDAdvertisingFeedbackOutputModel feedback(String sdReferenceId, SDAdvertisingFeedbackInputModel request){
		return JsonReader.read("feedback-SDAdvertisingFeedbackOutputModel.json",new TypeReference<SDAdvertisingFeedbackOutputModel>(){});
	}
	
	public CRAdvertisingCampaignManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRAdvertisingCampaignManagementPlanGrantInputModel request){
		return JsonReader.read("grant-CRAdvertisingCampaignManagementPlanGrantOutputModel.json",new TypeReference<CRAdvertisingCampaignManagementPlanGrantOutputModel>(){});
	}
	
	public BQCampaignDirectionRequestOutputModel requestCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionRequestInputModel request){
		return JsonReader.read("request-BQCampaignDirectionRequestOutputModel.json",new TypeReference<BQCampaignDirectionRequestOutputModel>(){});
	}
	
	public BQMarketTrackingRequestOutputModel requestMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingRequestInputModel request){
		return JsonReader.read("request-BQMarketTrackingRequestOutputModel.json",new TypeReference<BQMarketTrackingRequestOutputModel>(){});
	}
	
	public BQPerformanceAssessmentRequestOutputModel requestPerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentRequestInputModel request){
		return JsonReader.read("request-BQPerformanceAssessmentRequestOutputModel.json",new TypeReference<BQPerformanceAssessmentRequestOutputModel>(){});
	}
	
	public CRAdvertisingCampaignManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRAdvertisingCampaignManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRAdvertisingCampaignManagementPlanRequestOutputModel.json",new TypeReference<CRAdvertisingCampaignManagementPlanRequestOutputModel>(){});
	}
	
	public CRAdvertisingCampaignManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRAdvertisingCampaignManagementPlanRetrieveOutputModel.json",new TypeReference<CRAdvertisingCampaignManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQCampaignDirectionRetrieveOutputModel retrieveCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCampaignDirectionRetrieveOutputModel.json",new TypeReference<BQCampaignDirectionRetrieveOutputModel>(){});
	}
	
	public BQMarketTrackingRetrieveOutputModel retrieveMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMarketTrackingRetrieveOutputModel.json",new TypeReference<BQMarketTrackingRetrieveOutputModel>(){});
	}
	
	public BQPerformanceAssessmentRetrieveOutputModel retrievePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPerformanceAssessmentRetrieveOutputModel.json",new TypeReference<BQPerformanceAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDAdvertisingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDAdvertisingRetrieveOutputModel.json",new TypeReference<SDAdvertisingRetrieveOutputModel>(){});
	}
	
	public CRAdvertisingCampaignManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRAdvertisingCampaignManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRAdvertisingCampaignManagementPlanUpdateOutputModel.json",new TypeReference<CRAdvertisingCampaignManagementPlanUpdateOutputModel>(){});
	}
	
	public BQCampaignDirectionUpdateOutputModel updateCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionUpdateInputModel request){
		return JsonReader.read("update-BQCampaignDirectionUpdateOutputModel.json",new TypeReference<BQCampaignDirectionUpdateOutputModel>(){});
	}
	
	public BQMarketTrackingUpdateOutputModel updateMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingUpdateInputModel request){
		return JsonReader.read("update-BQMarketTrackingUpdateOutputModel.json",new TypeReference<BQMarketTrackingUpdateOutputModel>(){});
	}
	
	public BQPerformanceAssessmentUpdateOutputModel updatePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentUpdateInputModel request){
		return JsonReader.read("update-BQPerformanceAssessmentUpdateOutputModel.json",new TypeReference<BQPerformanceAssessmentUpdateOutputModel>(){});
	}
	
}
