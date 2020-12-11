
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLoja {

	@Test
	public void testCadastrar() {
		Produto p = new Produto(001, "caribe", 0.5);
		ControleMain controle = new ControleMain();
		controle.Cadastrar(p);
		assertEquals(1, controle.produtos.size());
	}
	
	@Test
	public void testListar() {
		Produto p1 = new Produto(001, "crocante", 0.5);
		Produto p2 = new Produto(002, "caribe", 0.8);
		ControleMain controle = new ControleMain();
		controle.Cadastrar(p1);
		controle.Cadastrar(p2);
		controle.Listar();
		assertEquals("Codigo - Nome - Preço - Quantidade\n1  crocante  0.5  0\n2  caribe  0.8  0", controle.Lista);
	}

	@Test
	public void testRemover() {
		Produto p = new Produto(001, "caribe", 0.5);
		ControleMain controle = new ControleMain();
		controle.Cadastrar(p);
		assertEquals(1, controle.produtos.size());
		controle.Remover(p);
		assertEquals(0, controle.produtos.size());
	}
	
	@Test
	public void testAdicionar() {
		Produto p = new Produto(001, "caribe", 0.5);
		ControleMain controle = new ControleMain();
		controle.Cadastrar(p);
		controle.Adicionar(001, 4);
		assertEquals(4, controle.produtos.get(0).quantidade);
	}

	@Test
	public void testVender() {
		Produto p = new Produto(001, "caribe", 0.5);
		ControleMain controle = new ControleMain();
		controle.Cadastrar(p);
		controle.Adicionar(001, 4);
		controle.Vender(001, 2);
		assertEquals(2, controle.produtos.get(0).quantidade);
	}

}
