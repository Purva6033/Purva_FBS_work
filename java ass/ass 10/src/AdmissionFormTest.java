class EmptyNameException extends Exception{
	public EmptyNameException(String msg) {
		super(msg);
	}
}

class UnderageException extends Exception{
	public UnderageException(String msg) {
		super(msg);
	}
}

class InvalidPercentageException extends Exception {

    public InvalidPercentageException(String msg) {
        super(msg);
    }
}	
class NotFitForAdmissionException extends Exception{
	public NotFitForAdmissionException(String msg) {
		super(msg);
	}
}	
	class FeesNotPaidException extends Exception {

	    public FeesNotPaidException(String msg) {
	        super(msg);
	    }
	}
	
	class InsufficientFeesException extends Exception {

	    public InsufficientFeesException(String msg) {
	        super(msg);
	    }
	}


class AdmissionForm{
	String StudentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	
	public AdmissionForm(String studentName,int age,double percentage,double courseFees,double feesPaid) {
		
		this.StudentName=studentName;
		this.age=age;
		this.percentage=percentage;
		this.courseFees=courseFees;
		this.feesPaid=feesPaid;
	}
	
	public void validateForm()
	throws EmptyNameException,UnderageException,NotFitForAdmissionException,InvalidPercentageException,FeesNotPaidException,InsufficientFeesException {
		if(StudentName.trim().isEmpty()) {throw new EmptyNameException("name cannot be empty");}
		if(age < 17) {throw new UnderageException("age must be atleast 17");}
		if(percentage < 0 || percentage > 100) {throw new InvalidPercentageException("percentage must be b/w 0 to 100");	}
		if(percentage < 35) {throw new NotFitForAdmissionException("student not eligible for admission");}
		if(feesPaid == 0) {throw new FeesNotPaidException("min 40% fees needed to be paid !");}
		if(feesPaid < (0.30 * courseFees)) {
		    throw new InsufficientFeesException(
		    "Minimum 30% fees required");
		}
		System.out.println("admission successful..");
	}
}

public class AdmissionFormTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AdmissionForm s1 = new AdmissionForm ("P",45,95,50000,30000);
     try {
    	 s1.validateForm();
     }
     catch(EmptyNameException e) {
    	 System.out.println(e.getMessage());
     }
     catch (UnderageException e) {
         System.out.println(e.getMessage());
     }

     catch (InvalidPercentageException e) {
         System.out.println(e.getMessage());
     }

     catch (NotFitForAdmissionException e) {
         System.out.println(e.getMessage());
     }

     catch (FeesNotPaidException e) {
         System.out.println(e.getMessage());
     }

     catch (InsufficientFeesException e) {
         System.out.println(e.getMessage());
     }
 
	}
}
