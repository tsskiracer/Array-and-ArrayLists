import java.util.ArrayList;

public class VehiclesArrayListLesson
	{
		private String car;
		private String boat;
		private String plane; 
		ArrayList<String> vehicles = new ArrayList<String>();
		public String getCar()
			{
				return car;
			}
		public void setCar(String car)
			{
				this.car = car;
			}
		public String getBoat()
			{
				return boat;
			}
		public void setBoat(String boat)
			{
				this.boat = boat;
			}
		public String getPlane()
			{
				return plane;
			}
		public void setPlane(String plane)
			{
				this.plane = plane;
			}
		public void setQuestions(String questions)
			{
				this.boat = questions;
			}
		public VehiclesArrayListLesson(String c, String b, String p)
		{
			c=car;
			b=boat;
			p=plane;
			vehicles.add("Porsche");
			vehicles.add("Lamborgini");
			vehicles.add("Jet");
			vehicles.add("Turboprop");
			vehicles.add("Dinghy");
			System.out.println(vehicles);
			
		}
	}


	

			
	

