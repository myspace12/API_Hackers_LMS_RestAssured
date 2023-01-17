package resources;

public enum ApiResources {
	
	GetProgAPI ("/allPrograms"),

	GetProg_byldAPI("/programs/"),
	AddProgAPI("/saveprogram"),
	PutProgbyldAPI("/putprogram/"),
	PutProgbyNmAPI("/program/"),
	DeleteProgramByIDAPI("/ deletebyprogname/"),
	DeleteProgramByNameAPI("/ deletebyprogname/"),
	AddBatchAPI("/batches"),
	GetBatchAPI("/batches"), 
	GetBatchByNmAPI(" /batches/batchName/"),
	GetBatchByPrldAPI(" /batches/ program/"),
	GetBatchByIdAPI("/batches/batchId/"),
	PutBatchAPI("/batches/"),
	DeleteBatchByldAPI("/deletebyprogid/");

	
				
    private String resource;
	
	 ApiResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
}
