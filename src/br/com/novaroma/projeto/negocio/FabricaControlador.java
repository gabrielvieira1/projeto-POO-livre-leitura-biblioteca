package br.com.novaroma.projeto.negocio;

public class FabricaControlador {

  public static IControladorCliente getInstanciaControladorCliente() {
	  return new ControladorCliente();
	}
  
   public static IControladorFuncionario getInstanciaControladorFuncionario() {
		return new ControladorFuncionario();
	}
  
  public static IControladorLivro getInstanciaControladorLivro() {
		return new ControladorLivro();
	}
  
  public static IControladorMaterialEspecial getInstanciaControladorMaterialEspecial() {
		return new ControladorMaterialEspecial();
	}
  
}
