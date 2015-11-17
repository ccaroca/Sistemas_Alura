package br.com.caelum.empresa;

public class SistemaInterno {
	
	
	void login(Autenticavel a) {

        int senha = 123;//pega senha de um lugar, ou de um scanner de polegar

        // aqui eu posso chamar o autentica! 
        // Pois todo FuncionarioAutenticavel tem
       // boolean ok = 
        		a.autentica(senha);

    }
}
