package testActivityTime;

import java.io.IOException;

public class ActivityTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getActivityTime();
	}
	
	//ÊäÈë´ý²âÊÔµÄactivityname
	public static String activityName() {
		String name="";
		return name;
	}
	
	public static String getActivityTime() {
		try {
			Runtime.getRuntime().exec("adb logcat -s ActivityManager|grep Displayed >d:/\rr.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
