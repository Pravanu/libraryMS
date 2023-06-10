package com.LibMS.LibraryDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.LibMS.LibraryDemo.bean.Library;
import com.LibMS.LibraryDemo.service.LibService;


@RestController
public class LibController {
	@Autowired
	private LibService libService;
	
	@RequestMapping("/libraries")
	public List<Library>getAllLibraries(){
		return libService.getAllLibraries();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/libraries")
	public void addNewMember(@RequestBody Library library){
		libService.addNewMember(library);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/libraries/{MemberId}")
	public void updateNewMember(@PathVariable String MemberId, @RequestBody Library library){
		libService.updateNewMember(MemberId, library);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/libraries/{MemberId}")
	public void deleteMember(@PathVariable String MemberId){
		libService.deleteMember(MemberId);
	}
	
	
	
	
}
