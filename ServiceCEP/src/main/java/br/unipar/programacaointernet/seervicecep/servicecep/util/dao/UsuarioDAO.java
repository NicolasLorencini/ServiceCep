package br.unipar.programacaointernet.seervicecep.servicecep.util.dao;

import br.unipar.programacaointernet.seervicecep.servicecep.util.model.Usuario;

import java.util.List;

public interface UsuarioDAO {

    void save(Usuario usuario);
    void update (Usuario usuario);
    void delete (Usuario usuario);

    Usuario findById(long id);
    List<Usuario> findAll ();
}
