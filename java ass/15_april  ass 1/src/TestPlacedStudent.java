
public class TestPlacedStudent {

		int frn;
		String studentName, companyName, designation;
		double distanceCovered;

		TestPlacedStudent(){
		frn = 1;
		studentName = "S";
		distanceCovered = 3;
		companyName = "info";
		designation = "developer";
		}

		TestPlacedStudent(int frn,String studentName, double distanceCovered, String companyName,String designation){
		this.frn = frn;
		this.studentName = studentName;
		this.distanceCovered = distanceCovered;
		this.companyName = companyName;
		this.designation = designation;
		}

		int getFrn() {return frn; }
		void setFrn(int frn) {this.frn=frn; }

		String getStudentName() {return studentName; }
		void setStudentName(String studentName) {this.studentName=studentName; }

		double getDistanceCovered() {return distanceCovered; }
		void setDistanceCovered(double distanceCovered ) {this.distanceCovered=distanceCovered;}

		String getCompanyName() {return companyName; }
		void setCompanyName(String companyName) {this.companyName=companyName; }

		String getDesignation() {return designation; }
		void setDesignation(String designation) {this.designation=designation; }

		void display(){
		System.out.println(frn + " " + studentName + " " + distanceCovered + " " + companyName + " " + designation);
		}
		

		
		public static void main(String [] args){
		TestPlacedStudent ps = new TestPlacedStudent(1,"S",3,"info","developer");
		ps.display();
		System.out.println(ps.hashCode());
		}}

