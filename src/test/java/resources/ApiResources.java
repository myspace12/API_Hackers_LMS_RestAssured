package resources;

public enum ApiResources {
	
	GetProgAPI ("/allPrograms/"),

	AddProgAPI("/saveprogram/"),
	
	GetBatchAPI("/batches/"),
	
	AddBatchAPI("/batches/");
		
			
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