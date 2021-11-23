package br.com.zup.LeadCollector.lead;

import br.com.zup.LeadCollector.produto.Produto;
import br.com.zup.LeadCollector.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
    @Autowired
    private LeadRepository leadRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> atualizarProdutos (List<Produto> novosProdutos){
        List<Produto> listaAtual = new ArrayList<>();

        for (Produto produtoReferencia : novosProdutos){
            if (produtoRepository.existsById(produtoReferencia.getId())){
                listaAtual.add(produtoRepository.findByNome(produtoReferencia.getNome()));
            } else {
                listaAtual.add(produtoReferencia);
            }
        }
        return listaAtual;
    }

}
