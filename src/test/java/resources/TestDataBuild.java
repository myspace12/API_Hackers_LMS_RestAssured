package resources;

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

}
