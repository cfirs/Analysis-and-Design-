import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;


public class delivery {
	
	public Date date;
	public Time leaving_time;
	public int truck_id;
	public int driver_id;
	public String source_address;
	public ArrayList<pair<String,Integer>> stops_invation;
	
	public delivery(Date date, Time leaving_time, int truck_id, int driver_id, String source_address,
			ArrayList<pair<String, Integer>> stops_invation) {
		
		this.date = date;
		this.leaving_time = leaving_time;
		this.truck_id = truck_id;
		this.driver_id = driver_id;
		this.source_address = source_address;
		this.stops_invation = stops_invation;
	}
	
	
	
	
}
