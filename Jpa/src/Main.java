import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactoryBuilder emf=Persistence.createEntityManagerFactory("Student_details");  
	}
}
