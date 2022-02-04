package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		
		Department department = departmentDao.findById(3);
		System.out.println(department);		
		
		
		
		System.out.println("\n=== TEST 2: department findAll ===");
		
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("\n=== TEST 4: seller insert =====");
		
		Department newDepartment = new Department(null, "Paint");
		DepartmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		*/
		

	}

}
