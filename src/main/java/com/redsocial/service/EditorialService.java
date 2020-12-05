package com.redsocial.service;

import java.util.List;

import com.redsocial.entity.Editorial;

public interface EditorialService {

	public List<Editorial> listarTodos();

	public List<Editorial> listarPorNombre(String filtro);
}
