package resources;



import pojo_Classes.AddProg;

public class TestDataBuild {
	
public AddProg addProgPayload(String programName,String programDescription,String programStatus)
	
	{
		AddProg a=new AddProg();
		a.setprogramName(programName);
		a.setprogramDescription(programDescription);
		a.setprogramStatus(programStatus);
	
		return a;
		
		
	}
	
	public AddBatch postBatchPayload(String BatchName, String batchDes, String batchStatus, int noOfClasses, int progId,
			String progNm) {
		AddBatch M = new AddBatch();
		M.setBatchName(BatchName);
		M.setBatchDescription(batchDes);
		M.setBatchStatus(batchStatus);
		M.setBatchNoOfClasses(noOfClasses);
		M.setProgramId(progId);
		M.setProgramName(progNm);

		return M;

	}

	public PutProg putProgPayload(String ProgramName, String ProgramDes, String ProgStatus, String creationTime, String lastModTime) {

		PutProg Put = new PutProg();
		Put.setProgramName(ProgramName);
		Put.setProgramDescription(ProgramDes);
		Put.setProgramStatus(ProgStatus);
		Put.setCreationTime(creationTime);
		Put.setLastModTime(lastModTime);
		
		return Put;

	}
	
  }
