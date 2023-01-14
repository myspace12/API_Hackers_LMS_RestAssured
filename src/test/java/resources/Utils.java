package resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {
	
	public static RequestSpecification requestSpecBuilder;
	public static ResponseSpecification responseSpecBuilder;
	public static ResponseSpecification responseSpec;
	static ApiResources resourceAPI;
	public static Response response;
	
	
	public static RequestSpecification requestSpecification() throws IOException
	{
		
       
        if(requestSpecBuilder==null)
		{
		PrintStream log =new PrintStream(new FileOutputStream("logging.txt"));
		 requestSpecBuilder=new RequestSpecBuilder().setBaseUri(getGlobalValue("baseURI"))
				  .addFilter(RequestLoggingFilter.logRequestTo(log))
				 .addFilter(ResponseLoggingFilter.logResponseTo(log))
		         .setContentType(ContentType.JSON).build();
		
		}
		return requestSpecBuilder;
		
		
	}
	
	public static String resource(String resource)
	{
		
		resourceAPI = ApiResources.valueOf(resource);
		String apiEndpoint = resourceAPI.getResource();
		return apiEndpoint;
		
	}
	
	
	//read data from config file
	
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("./src/test/java/resources/config.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	
	//make a method static so that you can access it without creating any object
	//Method to parse JSON Path and get any particular key value
	
	public static String getJsonPath(Response response,String key)
	{
		System.out.println("In JsonPath");
		String resp=response.asString();
		JsonPath   js = new JsonPath(resp);
		return js.get(key).toString();
    }
	
	public ResponseSpecification responseSpecification() throws NumberFormatException, IOException
	{
	responseSpecBuilder = new ResponseSpecBuilder().
			expectStatusCode(Integer.parseInt(getGlobalValue("StatusCode"))).
			expectContentType(ContentType.JSON).build();
    
	return responseSpecBuilder;
	}
	

	

}
