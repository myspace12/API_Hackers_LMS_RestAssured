package resources;

import pojo_Classes.AddBatch;
import pojo_Classes.AddProg;
import pojo_Classes.PutBatch;

public class TestDataBuild {
	
	public PutBatch putBatchPayload(String batchNm, String batchDes, 
			String batchStatus, int noOfClasses, int progId , String progNm)
	{
		//create object for pojo class 
		
		PutBatch p = new PutBatch();
		p.setBatchNm(batchNm);
		p.setBatchDes(batchDes);
		p.setBatchStatus(batchStatus);
		p.setBatchNoOfClasses(noOfClasses);
		p.setProgId(progId);
		p.getProgNm();
		
		return p;
		
	}

	public AddProg addProgPayload(String programName,String programDescription,String programStatus)
	
	{
		AddProg a=new AddProg();
		a.setprogramName(programName);
		a.setprogramDescription(programDescription);
		a.setprogramStatus(programStatus);
	
		return a;
		
		
	}
	

	public AddBatch postBatchPayload(String BatchName, String batchDes, 
				String batchStatus, int noOfClasses, int progId , String progNm) 
		{
			AddBatch M = new AddBatch();
			M.setBatchNm(BatchName);
			M.setBatchDes(batchDes);
			M.setBatchStatus(batchStatus);
			M.setBatchNoOfClasses(noOfClasses);
			M.setProgId(progId);
			M.setProgNm(progNm);
			
			return M;
			
			
		}

	
}
