public class Author{
	
	private String Name;
	private String Email;
	private String Gender;
	

	public Author(String Name, String Email, String Gender) {
		setName(Name);
		setEmail(Email);
		setGender(Gender);
	}
	// retorna o Name
	public String getName() {
		return Name;
	}
	// "seta" o Name
	public void setName(String Name) {
		this.Name = Name;
	}
	// retorna o Name
	public String getEmail() {
		return Email;
	}
	// "seta" o Name
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getGender() {
		return Gender;
	}
	// "seta" o Name
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
}