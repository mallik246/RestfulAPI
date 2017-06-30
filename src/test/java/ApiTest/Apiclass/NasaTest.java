package ApiTest.Apiclass;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class NasaTest {
  @Test
  public void testApiData() throws JsonParseException, JsonMappingException, IOException {
	  
//	  Client client=new Client();
//	  WebResource resource=client.resource("https://api.nasa.gov/planetary/sounds?q=apollo&api_key=DEMO_KEY");
//	  String response = resource.get(String.class);
//	  
//	  int count = response.length();
//	  boolean b = response.contains("count");
//	  Assert.assertTrue(b);
//	  System.out.println(count +"    "+ b);
	  ObjectMapper object= new ObjectMapper();
	  Info info= object.readValue(new File (System.getProperty("user.dir") + "//TestData//APIJSON.json"), Info.class);
	  
	  
	  Integer countValue = info.getCount();
	  Assert.assertTrue(countValue==10?true:false);
	  
	  
  }
}
