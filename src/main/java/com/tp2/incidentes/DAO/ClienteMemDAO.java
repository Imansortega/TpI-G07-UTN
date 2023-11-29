package com.tp2.incidentes.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import com.tp2.incidentes.modelos.Cliente;

public class ClienteMemDAO implements DAO<Cliente>{

	private List<Cliente> clienteList = new ArrayList<>();
    
    @Override
    public Optional<Cliente> get(int id) {
        return Optional.ofNullable(clienteList.get(id));
    }

    @Override
    public Collection<Cliente> getAll() {
    	//System.out.println("getAll en ClienteDAO");
        return clienteList.stream()
          .filter(Objects::nonNull)
          .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    @Override
    public int save(Cliente cliente) {
    	//System.out.println("save en ClienteDAO");
    	//System.out.println(cliente.getRazonSocial() + " @ ClienteDAO, save");
    	
    	clienteList.add(cliente);
        int index = clienteList.size() - 1;
        cliente.setIdCliente(index);
        //System.out.println("Indice: " + index);
        return index;
    }

    @Override
    public void update(Cliente cliente) {
    	//System.out.println(cliente.getRazonSocial() + " @ ClienteDAO, update");
    	clienteList.set(cliente.getIdCliente(), cliente);
    }

    @Override
    public void delete(Cliente cliente) {
    	clienteList.set(cliente.getIdCliente(), null);
    }
	
}