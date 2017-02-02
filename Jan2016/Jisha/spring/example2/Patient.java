package spring.example2;

import java.util.Iterator;
import java.util.List;

public class Patient {
	     int id;
		 String name;  
		 List <String> diseases;
		public Patient(int id, String name, List<String> diseases) {
			super();
			this.id = id;
			this.name = name;
			this.diseases = diseases;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<String> getDiseases() {
			return diseases;
		}
		public void setDiseases(List<String> diseases) {
			this.diseases = diseases;
		}
		public void show(){
			System.out.println(id);
			System.out.println(name);
			Iterator r=diseases.iterator();
			while(r.hasNext()){
				System.out.println(r.next());
			}
		}
		}
	
		 

		 
		
		 
		