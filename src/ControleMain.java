
import java.util.ArrayList;

public class ControleMain {
	
	ArrayList <Produto> produtos = new ArrayList<Produto>();
	String Lista="Codigo - Nome - Preço - Quantidade";
	
	public ControleMain() {
		
	}
	
	public void Cadastrar(Produto produto) {
		
		produtos.add(produto);
		
	}

	public void Listar() {
		Lista="Codigo - Nome - Preço - Quantidade";
		
		produtos.forEach((p) -> {
			Lista = Lista+"\n"+p.codigo+"  "+p.nome+"  "+p.preco+"  "+p.quantidade;
		});
		
		System.out.print(Lista);
	}

	public void Remover(Produto produto) {
		
		produtos.remove(produto);
		
	}
	
	public void Adicionar(int codigo, int quantidade) {
		int index = 0;
		for(int i=0;i==produtos.size();i++) {
			if(produtos.get(i).codigo == codigo) {
				index = i;
				i = produtos.size();
			}
		}
		produtos.get(index).quantidade = produtos.get(index).quantidade + quantidade;
	}

	public void Vender(int codigo, int quantidade) {
		int index = 0;
		for(int i=0;i==produtos.size();i++) {
			if(produtos.get(i).codigo == codigo) {
				index = i;
				i = produtos.size();
			}
		}
		produtos.get(index).quantidade = produtos.get(index).quantidade - quantidade;
	}


}
