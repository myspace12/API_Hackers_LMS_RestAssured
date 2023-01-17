package resources;

public enum ApiResources {
	
	GetProgAPI ("/allPrograms"),

	GetProg_byldAP("/programs/"),
	AddProgAPI("/saveprogram"),
	PutProgbyldAPI("/putprogram/"),
	PutProgbyNmAPI("/program/"),
	DeleteProgramByIDAPI("/ deletebyprogname/"),
	DeleteProgramByNameAP("/ deletebyprogname/"),
	AddBatchAPI("/batches"),
	GetBatchAP("/batches"), 
	GetBatchByNmAP(" /batches/batchName/"),
	GetBatchByPrldAPI(" /batches/ program/"),
	GetBatchByIdAPI("/batches/batchId/"),
	PutBatchAPI("/batches/"),
	DeleteBatchByldAP("/deletebyprogid/");

	
				
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
