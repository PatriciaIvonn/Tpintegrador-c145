package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Usuario;
import com.ap.tpintegrado.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImp implements UsuarioService {
    private final UsuarioRepository usuarioRepository;

    // Guarda
    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Obtiene uno
    @Override
    public Usuario obtenerPorId(long id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    // Obtiene todos
    @Override
    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    // Actualiza
    @Override
    public Usuario actualizar(Usuario usuario, long id) {
        Usuario usuarioDB = usuarioRepository.findById(id).orElseThrow();
//        clienteDB.setRazonSocial(cliente.getRazonSocial());
        // clienteDB.setActivo(cliente.getAActivo());

        return usuarioRepository.save(usuarioDB);
    }

    // Elimina
    @Override
    public void eliminar(long id) {
        usuarioRepository.deleteById(id);
    }
}
