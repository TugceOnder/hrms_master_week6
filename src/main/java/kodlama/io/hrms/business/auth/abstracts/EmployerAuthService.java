package kodlama.io.hrms.business.auth.abstracts;

import kodlama.io.hrms.entities.concretes.Employer;
public interface EmployerAuthService {

	boolean checkCompanyName(Employer employer);
	boolean checkPhoneNumber(Employer employer);
	boolean checkWebSite(Employer employer);
	boolean checkWebSiteMail(Employer employer);
	
}
