package ApiTest.Apiclass;

public class Results {

	private String license;
	private Integer id;
	private Integer duration;
	
	private String description;
	private String title;
	private String download_url;
	private String last_modified;
	private String stream_url;
	private String tag_list;
	
	
	public String getStreamUrl(){
		return stream_url;
	}
	
	public String getTagList(){
		return tag_list;
	}
	
	
	
	public String getLastModified(){
		return last_modified;
	}
	
	public String getDescription(){
		return description;
	}
	
	
	public String getLicense(){
		return license;
		
	}
	
	
	public Integer getId(){
		return id;
	}
	
	public Integer getDuration(){
		return duration;
	}


	public String getTitle() {
		return title;
	}


	


	public String getDownload_url() {
		return download_url;
	}


	
}
