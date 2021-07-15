package utility;

import java.util.Map;

public class VmArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getRegionAndEnv());
	}

	public static String getRegionAndEnv() {

		String regionAndEnv;
		regionAndEnv = System.getProperty("region") + "_" + System.getProperty("env");
		return regionAndEnv;

	}
	
	public Map<String,String> getUrlMapFromYaml(){
	//	ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		return null;
	}

}
