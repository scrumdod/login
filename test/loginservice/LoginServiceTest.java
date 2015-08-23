package loginservice;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class LoginServiceTest {
	@Test
	public void itShouldSetAccountToLoggedInWhenPasswordMatches(){
		IAccount account = mock(IAccount.class);
		when(account.passwordMatches(anyString())).thenReturn(true);
		
		IAccountRepository accountRepo = mock(IAccountRepository.class);
		
		when(accountRepo.find(anyString())).thenReturn(account);
		
		LoginService service = new LoginService(accountRepo);
		
		service.login("rob","password");
		
		verify(account,times(1)).setLoggedIn(true);
		
		
	}
}
