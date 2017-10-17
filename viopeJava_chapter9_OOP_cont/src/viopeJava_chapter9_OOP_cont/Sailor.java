package viopeJava_chapter9_OOP_cont;

public class Sailor {
	private String name;
	private String email;

	public Sailor(String name, String email) {

		this.name = name;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

    @Override
    public String toString() {
        return "Sailor{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
