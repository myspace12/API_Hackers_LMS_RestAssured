package resources;

public enum ApiResources {
	
	GetProgAPI ("/allPrograms/"),
	GetProg_byIdAPI("/programs/"),
	AddProgAPI("/saveprogram/"),
	PutProg_byIdAPI("/putprogram/"),
	PutProg_byNmAPI("/program/"),
	DelProg_byIdAPI("/deletebyprogid/"),
	DelProg_bynm("/deletebyprogname/");
	
	
	
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
