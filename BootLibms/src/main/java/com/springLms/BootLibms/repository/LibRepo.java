package com.springLms.BootLibms.repository;

import org.springframework.data.repository.CrudRepository;

import com.springLms.BootLibms.bean.Library;

public interface LibRepo extends CrudRepository<Library, String> {

	
}
