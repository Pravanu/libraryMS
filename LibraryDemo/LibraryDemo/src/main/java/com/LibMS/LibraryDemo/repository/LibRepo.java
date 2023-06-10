package com.LibMS.LibraryDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.LibMS.LibraryDemo.bean.Library;

public interface LibRepo extends CrudRepository<Library, String> {

	
}
