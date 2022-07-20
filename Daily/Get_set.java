package executor;
class Random{
	private int pid;
	private String name;
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setpid(int pid) {
		this.pid=pid;
	}
	public int getpid() {
		return pid;
	}
}

public class Get_set {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random t = new Random();
		t.setname("Manav Dhruve");
		t.setpid(193019);
		System.out.println("Name is : "+t.getname()+" and pid is : "+t.getpid());

	}

}
