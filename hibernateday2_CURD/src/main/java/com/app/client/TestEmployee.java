package com.app.client;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import com.app.config.HibernateUtil;
import com.app.model.Employee;

public class TestEmployee {

	Scanner sc = new Scanner(System.in);

	Session session = HibernateUtil.getSessionFactory().openSession();

	public void insertData() {

		try {
			System.out.println("Enter How Many Employee Data You Want To Insert: ");
			int n = sc.nextInt();
			sc.nextLine();

			for (int i = 1; i <= n; i++) {

				Employee e = new Employee();

				System.out.println("\nEmployee " + i + " Details");
				System.out.println("Enter Name: ");
				e.setName(sc.nextLine().toUpperCase());

				System.out.println("Enter Salary: ");
				e.setSalary(sc.nextFloat());
				sc.nextLine();

				System.out.println("Enter Department: ");
				e.setDepartment(sc.nextLine().toUpperCase());

				System.out.println("Enter Age: ");
				int age=sc.nextInt();
				
				while(age<18) {
						System.out.println("Required Age must be exactly 18 or Above 18...!");
						System.out.println("Pls Enter Your Age Again !");
						age=sc.nextInt();
				}
				e.setAge(age);
				sc.nextLine();

				System.out.println("Enter MobNo: ");
				long m = sc.nextLong();
				
				while (m < 7000000000L || m > 9999999999L) {
				    System.out.println("Required Mobile Number must be exactly 10 digits and start from 7, 8 or 9...!");
				    System.out.println("Please Enter Mobile Number Again: ");
				    m = sc.nextLong();
				}
				e.setMobno(m);
				sc.nextLine();
				
				System.out.println("Enter Adreess: ");
				e.setAddress(sc.nextLine().toUpperCase());
				System.out.println("----------------------------");

				session.persist(e);

				session.beginTransaction().commit();

			}

			System.out.println("Data Add Successfully..!");
		} catch (Exception e) {
			System.out.println("Enter Valid Data..");
		}

	}

	public Employee getData() {

		System.out.println("Enter Employee Id for Retrive Data: ");
		Employee e = session.find(Employee.class, sc.next());

		System.out.println("-------------Employee Details----------------");
		System.out.println("Employee Id        :" + e.getId());
		System.out.println("Employee Name      :" + e.getName());
		System.out.println("Employee Salary    :" + e.getSalary());
		System.out.println("Employee Department:" + e.getDepartment());
		System.out.println("Employee Age       :" + e.getAge());
		System.out.println("Employee MobileNo. :" + e.getMobno());
		System.out.println("Employee Address   :" + e.getAddress());
		System.out.println("-----------------------------------------");

		System.out.println("Get Data Successfully..!");
		return e;
	}

	public List<Employee> getAllData() {

		List<Employee> list = session.createNativeQuery("Select * from EmployeeDetails", Employee.class)
				.getResultList();

		for (Employee e : list) {

			System.out.println("-------------Employee Details----------------");
			System.out.println("Employee Id        :" + e.getId());
			System.out.println("Employee Name      :" + e.getName());
			System.out.println("Employee Salary    :" + e.getSalary());
			System.out.println("Employee Department:" + e.getDepartment());
			System.out.println("Employee Age       :" + e.getAge());
			System.out.println("Employee MobileNo. :" + e.getMobno());
			System.out.println("Employee Address   :" + e.getAddress());
			System.out.println("--------------------------------------------");
		}
		System.out.println("Get All Data Successfully..!");
		return list;

	}

	public Employee updateData() {

		Employee e = new Employee();
		try {

			System.out.println("Enter Employee Id Where You Want To Update Data");
			e.setId(sc.nextInt());

			System.out.println("Enter Name: ");
			e.setName(sc.next());

			System.out.println("Enter Salary: ");
			e.setSalary(sc.nextFloat());

			System.out.println("Enter Department: ");
			e.setDepartment(sc.next());

			System.out.println("Enter Age: ");
			e.setAge(sc.nextInt());

			System.out.println("Enter MobNo: ");
			e.setMobno(sc.nextLong());

			System.out.println("Enter Adreess: ");
			e.setAddress(sc.next());

			session.merge(e);

			session.beginTransaction().commit();

			System.out.println("Data Update Successfully..!");

		} catch (Exception e1) {
			System.out.println("Enter Valid Data..");
		}

		return e;

	}

	public String deleteData() {

		Employee e = new Employee();
		try {

			System.out.println("Enter Employee Id Where You Want To Delete Data");
			e.setId(sc.nextInt());

			session.remove(e);

			session.beginTransaction().commit();

		} catch (Exception e1) {
			System.out.println("Enter Valid Data..");
		}

		return "Data Delete Successfully !";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TestEmployee t = new TestEmployee();

		while (true) {
			System.out.println("\n------------MENU------------ \n1.Insert Employee Data " + "\n2.View Employee Data "
					+ "\n3.View All Employee Data" + " \n4.Update Employee Data " + "\n5.Delete Employee Data \n6.Exit "
					+ "\n\nEnter Your Choice: ");
			int n = sc.nextInt();
			sc.nextLine();

			switch (n) {

			case 1:
				t.insertData();
				break;

			case 2:
				t.getData();
				break;

			case 3:
				t.getAllData();
				break;

			case 4:
				t.updateData();
				break;

			case 5:
				String s = t.deleteData();
				System.out.println(s);
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Enter Valid Choice...!");

			}

		}

	}
}
