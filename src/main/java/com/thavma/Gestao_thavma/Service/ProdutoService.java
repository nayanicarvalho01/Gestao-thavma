package com.thavma.Gestao_thavma.Service;

import com.thavma.Gestao_thavma.DTO.ProdutoDTO;
import com.thavma.Gestao_thavma.Model.Produto;
import com.thavma.Gestao_thavma.Repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoDTO cadastrarProduto(ProdutoDTO dto) {

        Produto produto = new Produto();
        produto.setNomeProduto(dto.nomeProduto());
        produto.setPrecoProduto(dto.precoProduto());
        Produto produtoCadastrado = produtoRepository.save(produto);

        return toResponseDTO(produtoCadastrado);
    }

    public ProdutoDTO atualizarProduto(Long id, ProdutoDTO dto) {
        Produto produtoExistente = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com o ID: " + id));
        produtoExistente.setNomeProduto(dto.nomeProduto());
        produtoExistente.setPrecoProduto(dto.precoProduto());

        return toResponseDTO(produtoRepository.save(produtoExistente));
    }

    public ProdutoDTO toResponseDTO(Produto produto){
        return new ProdutoDTO(
                produto.getIdProduto(),
                produto.getNomeProduto(),
                produto.getPrecoProduto()
        );

    }
}
