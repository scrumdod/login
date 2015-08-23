package loginservice;

public interface IAccount {

	Boolean passwordMatches(String candidate);

	void setLoggedIn(boolean b);

}
