package com.ty.ApplicationProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.ApplicationProject.dao.UserDao;
import com.ty.ApplicationProject.dto.Application;
import com.ty.ApplicationProject.dto.User;
import com.ty.ApplicationProject.dao.*;



@Service
public class UserService1 {

	@Autowired
	UserDao userappdao;
	//@Autowired
	//ApplicationDao applicationdao;

	public User saveUser(User user)// , Application application
	{
		return userappdao.saveUser(user); // , application
	}

	public Application saveApp(Application appli) {
		return userappdao.saveApp(appli);
	}

	public User findEmail(String email) {
		return userappdao.findbyEmail(email);
	}
}

//public List<Application> getAllApplication(User user) {
//		
//		return applicationdao .getAllApplication();
//	}
//	public void removeApplicaton(int id)
//	{
//		applicationdao .removeApplication(id);
//	}
//    public Application getApplicatonByid(int id)
//    {
//    	return applicationdao.getById(id);
//    }
//    public void updateApplication(Application application)
//    {
//    	Application application1= applicationdao.updateApplication(application);
//    }
//}
