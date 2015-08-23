package loginservice;

public class LoginService {

	private IAccountRepository accountRepository;

	public LoginService(IAccountRepository accountRepo) {
		this.accountRepository = accountRepo;
	}

	public void login(String accountId, String password) {
		IAccount account = accountRepository.find(accountId);
		account.setLoggedIn(true);
	}

}
