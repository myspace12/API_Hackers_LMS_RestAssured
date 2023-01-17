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
	
  }
