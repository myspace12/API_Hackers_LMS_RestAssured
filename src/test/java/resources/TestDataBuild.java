package resources;

import pojo_Classes.AddBatch;
import pojo_Classes.AddProg;
import pojo_Classes.PutBatch;

public class TestDataBuild {
			
	
	
	public PutBatch putBatchPayload(String batchName, String batchDescription, 
			String batchStatus, int batchnoOfClasses, int programId , String programName)
	{
		//create object for pojo class 
		
		PutBatch p = new PutBatch();
		p.setBatchName(batchName);
		p.setBatchDescription(batchDescription);
		p.setBatchStatus(batchStatus);
		p.setBatchNoOfClasses(batchnoOfClasses);
		p.setProgramId(programId);
		p.setProgramName(programName);
	
		return p;
		
	}
	
	
	

}
