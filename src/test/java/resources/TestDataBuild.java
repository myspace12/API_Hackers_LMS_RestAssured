package resources;

import pojo_Classes.AddBatch;
import pojo_Classes.PutBatch;
import pojo_Classes.PutProg;

public class TestDataBuild {

	

	

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
