package misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DeviceDemo {

	public static void main(String[] args) {
		String[] deviceList = {"switch","tv","switch", "tv", "switch", "tv"};
		System.out.println(Arrays.toString(deviceNames(deviceList)));
		
	}
	
	static String [] deviceNames( String [] deviceList) {
		Map<String, Integer> devicesMap = new HashMap<String, Integer>();
		int count = 0;
		String deviceName = "";
		for(int i=0;i<deviceList.length;i++) {
			deviceName = deviceList[i];
			if (devicesMap.containsKey(deviceName)) {
				count = devicesMap.get(deviceName);
				deviceList[i] = deviceName + count;
				count++;
				devicesMap.put(deviceName, count);
			}
			else {
				devicesMap.put(deviceName, 1);
			}
		}
		
		return deviceList;
	}

}
