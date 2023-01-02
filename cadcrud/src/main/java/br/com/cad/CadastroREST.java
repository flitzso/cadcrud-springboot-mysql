package br.com.cad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cad.database.RepositorioCad;
import br.com.cad.entidade.Cadastro;

@RestController
@RequestMapping("/cadastro")
public class CadastroREST {

    @Autowired
    private RepositorioCad repositorio;

    @GetMapping
    public List<Cadastro> listar() {
        return repositorio.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Cadastro cadastro) {
        repositorio.save(cadastro);
    }

    @PutMapping
    public void alterar(@RequestBody Cadastro cadastro) {
        if (cadastro.getId() > 0)
            repositorio.save(cadastro);
    }

    @DeleteMapping
    public void excluir(Cadastro cadastro) {
        repositorio.delete(cadastro);
    }

}
