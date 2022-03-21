package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.RecordNotFoundException;
import com.example.Model.PolicyChecking;
import com.example.Response.ResponseHandler;
import com.example.Response.SucessResponse;
import com.example.Service.PolicyCheckingService;

@RestController
public class PolicyCheckingController {
	@Autowired
	 private PolicyCheckingService PolicyService;
	 
	 
	 @GetMapping("/check")
	    public ResponseEntity<Object> Get(){
	        try {
	            List<PolicyChecking> result = (List<PolicyChecking>) PolicyService.getPolicyChecking();
	            if(result==null){
	                throw new RecordNotFoundException("Record_Not_Found");
	            }
	            return  SucessResponse.generateResponse("Successfully retrieved all Data's!",HttpStatus.OK,result);
	        }catch(Exception e){

	        	return  ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);
	        }
} 
	 
	 
	 
	  @GetMapping("/check/{bikeId}")
	    public ResponseEntity<Object> Get(@PathVariable Long bikeId) {
		 try{
	    		PolicyChecking result =  this.PolicyService.getPolicyCheckingByBikeId(bikeId);
	    		
	    		if(result==null){
	    			throw new RecordNotFoundException("Record_Not_Found");
	    		}
	    		return SucessResponse.generateResponse("Successfully retrieved data!",HttpStatus.OK,result);
	    	
	    	}catch(Exception e){
	    		
	    	 return ResponseHandler.generateResponse(e.getMessage(),HttpStatus.MULTI_STATUS);	
	    	}
	 }

		

}
