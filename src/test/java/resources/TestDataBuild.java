package resources;



import pojo_Classes.AddProg;
import pojo_Classes.AddBatch;
import pojo_Classes.PutProg;
import pojo_Classes.PutBatch;
import pojo_Classes.GetBatch;
import pojo_Classes.GetProg;



public class TestDataBuild {
	
public AddProg addProgPayload(String programName,String programDescription,String programStatus,String creationTime,String lastModTime)
	
	{
		AddProg a=new AddProg();
		a.setprogramName(programName);
		a.setprogramDescription(programDescription);
		a.setprogramStatus(programStatus);
		a.setcreationTime(creationTime);
		a.setlastModTime(lastModTime);
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
