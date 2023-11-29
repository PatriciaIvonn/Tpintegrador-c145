package com.ap.tpintegrado.service;

import com.ap.tpintegrado.entity.Cliente;
import com.ap.tpintegrado.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImp implements ClienteService {
    // @Autowired
    // private clienteService clienteService;
    private final ClienteRepository clienteRepository;

    // Guardar o agregar
    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Obtener los datos de todos los clientes
//    @Override
//    public List<Cliente> obtenerUnClientePorId() {
//        return clienteRepository.findAll();
//    }

    // Obtener los datos de todos los clientes
    @Override
    public List<Cliente> obtenerTodos() {
        return clienteRepository.findAll();
    }

    // Actualizacion
    @Override
    public Cliente actualizar(Cliente cliente, long id) {
        Cliente clienteDB = clienteRepository.getReferenceById(id);

//        if(!cliente.getNombre().trim().isEmpty())
//            personaDB.setNombre(persona.getNombre());
//        if(persona.getContacto() != null) {
//            if (!persona.getContacto().getEmail().trim().isEmpty())
//                personaDB.getContacto().setEmail(persona.getContacto().getEmail());
//            if (!persona.getContacto().getCelular().trim().isEmpty())
//                personaDB.getContacto().setCelular(persona.getContacto().getCelular());
//        }
//        if(persona.getNacionalidad() != null)
//            personaDB.setNacionalidad(persona.getNacionalidad());
//        personaDB.setMascotas(persona.getMascotas());

        return clienteRepository.save(clienteDB);
    }

    // Eliminacion
    @Override
    public void eliminar(long id) {
        clienteRepository.deleteById(id);
    }
}
