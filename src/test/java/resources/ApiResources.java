package resources;

public enum ApiResources {
	
	GetProgAPI ("/allPrograms"),
	
	GetProg_byIdAPI("/programs/"),

	AddProgAPI("/saveprogram"),
	
	PutProgbyIdAPI("/putprogram/"),
	
	PutProgbyNmAPI("/program/"),
	
    DeleteProgramByIDAPI("/deletebyprogname/"),
	
	DeleteProgramByNameAPI("/deletebyprogname/"),
	
	AddBatchAPI("/batches"),
	
	GetBatchAPI("/batches"),
	
	GetBatchByNmAPI("/batches/batchName"),
	
	GetBatchByPrIdAPI("/batches/program"),
	
	PutBatchAPI("/batches/"),
	
	DeleteBatchByIdAPI("/deletebyprogid");

		
			
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