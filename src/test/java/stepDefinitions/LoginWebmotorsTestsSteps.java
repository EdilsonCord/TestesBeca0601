package stepDefinitions;

import io.cucumber.java.pt.*;
import pages.LoginWebmotorsPage;

public class LoginWebmotorsTestsSteps {
	
LoginWebmotorsPage loginWebmotors = new LoginWebmotorsPage();
	
	@Dado("que eu navego até a página de login do Webmotors")
	public void navegarAteLogin(){
		loginWebmotors.acessaPaginaLogin();
	}
	
	@Quando("eu preencho os meus dados")
	public void preenchoDados() {
		loginWebmotors.preencheDadosDeLogin("dandasaev@gmail.com", "36253202");
	}
	
	@E("clico no botão entrar")
	public void clicarEntrar() {
		loginWebmotors.clicarBotaoEntrar();
	}
	
	@Entao("eu estou logado")
	public void verificarPagina() {
		loginWebmotors.validaUrlPerfil();
	}
	
	
}
