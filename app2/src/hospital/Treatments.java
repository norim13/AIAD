package hospital;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Treatments {
	private List<Treatment> treatmentsList;
	private Boolean ordered;
	
	public Treatments(List<String> t, Boolean o){
		this.treatmentsList = new ArrayList<Treatment>();
		for(int i = 0; i < t.size(); i++){
			Treatment t_temp = Treatments.treatments.get(t.get(i));
			if(t_temp == null)
				System.out.println("Treatment "+t.get(i)+" not found... Ignoring.");
			else treatmentsList.add(t_temp);
		}
		this.ordered = false;
	}

	public Boolean getOrdered() {
		return ordered;
	}

	public List<Treatment> getTreatments() {
		return treatmentsList;
	}
	
	private static Hashtable<String,Treatment> treatments = new Hashtable<String,Treatment>()
	{
		private static final long serialVersionUID = -3925047417496743063L;

		{ 
			put("treatment-1", new Treatment("treatment-1", 13, 0));
			put("treatment-2", new Treatment("treatment-2", 5, 0));
			put("treatment-3", new Treatment("treatment-3", 12, 3));
			put("treatment-4", new Treatment("treatment-4", 5, 0));
			put("treatment-5", new Treatment("treatment-5", 5, 0));
		}
	};
	
	public static Treatment get(String treatment){
		return Treatments.treatments.get(treatment);
	}
}
