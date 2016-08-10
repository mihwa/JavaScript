package global;

public class Command implements Orderable{
	
	private String directory,action,view,page;
	
	public Command(String directory,String action,String page) {
		this.directory = directory;
		this.action = action;
		this.page = page;
		this.setView();
	}
	public Command(String directory,String action,
			String page,String keyField,String keyword) {
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getView() {
		return view;
	}
	public void setView() {
		this.view = "/WEB-INF/"+this.directory+"/"+this.page+".jsp";
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	
	
}

