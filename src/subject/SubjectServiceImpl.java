package subject;

public class SubjectServiceImpl implements SubjectService{
	private static SubjectServiceImpl instance = new SubjectServiceImpl();
	private SubjectServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public static SubjectServiceImpl getInstance() {
		return instance;
	}
	

}
