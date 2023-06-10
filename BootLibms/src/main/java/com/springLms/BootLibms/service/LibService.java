package com.springLms.BootLibms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springLms.BootLibms.bean.Library;
import com.springLms.BootLibms.repository.LibRepo;

@Service
public class LibService {

	@Autowired
	public LibRepo librepository;
	public List<Library>getAllLibraries(){
		
		List<Library>libraries = new ArrayList<>();
		librepository.findAll().forEach(libraries::add);
		return libraries;
	}
	
	public void addNewMember(Library library){
		librepository.save(library);
	}
	
	public void updateNewMember(String MemberId, Library library){
		librepository.save(library);
	}

	public void deleteMember(String MemberId) {
		
		librepository.deleteById(MemberId);
	}
	
	
}
