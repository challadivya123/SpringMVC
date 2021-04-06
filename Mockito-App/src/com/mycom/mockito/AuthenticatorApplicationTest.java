package com.mycom.mockito;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AuthenticatorApplicationTest {
@Test
public void testAuthenticate() {
	AuthenticatorInterface authenticatorMock;
	AuthenticatorApplication authenticator;
	String username="sagar_for_java";
	String password="sagaRS12_34";
	
	authenticatorMock=Mockito.mock(AuthenticatorInterface.class);
authenticator = new AuthenticatorApplication(authenticatorMock);	

when(authenticatorMock.authenticateUser(username,password))
.thenReturn(true);//password is authenticated
boolean actual=authenticator.authenticate(username, password);
assertTrue(actual);
}
}
