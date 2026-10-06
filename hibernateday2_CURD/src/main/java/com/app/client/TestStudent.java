package com.app.client;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import com.app.config.HibernateUtil;
import com.app.model.Student;

public class TestStudent {

	Scanner sc = new Scanner(System.in);

	Session session = HibernateUtil.getSessionFactory().openSession();

	public void addStudentData() {

		Student s = new Student();

		System.out.println("Enter Your Name");
		s.setName(sc.next());

		System.out.println("Enter Your Marks");
		s.setMarks(sc.nextFloat());

		System.out.println("Enter Your Department");
		s.setDepartment(sc.next());

		System.out.println("Enter Your Email");
		s.setGamil(sc.next());

		session.persist(s);

		session.beginTransaction().commit();

		System.out.println("Data Added Successfully");

	}

	public Student readStudentData() {

		System.out.println("Enter Rollno For ReadStudentData");
		Student data = session.find(Student.class, sc.next());

		System.out.println(data);

		System.out.println("View Data Successfully");

		return data;

	}

	public List<Student> getAllStudentData() {

		List<Student> list = session.createNativeQuery("Select * from student", Student.class).getResultList();

		return list;
	}

	public Student updateStudentData() {

		Student s = new Student();

		System.out.println("Enter RollNumber For Update StudentData");
		s.setRollno(sc.nextInt());

		System.out.println("Enter Your Name");
		s.setName(sc.next());

		System.out.println("Enter Your Marks");
		s.setMarks(sc.nextFloat());

		System.out.println("Enter Your Department");
		s.setDepartment(sc.next());

		System.out.println("Enter Your Email");
		s.setGamil(sc.next());

		Student update = session.merge(s);

		session.beginTransaction().commit();

		System.out.println("Data Update Successfully");

		return update;

	}

	public String deleteStudentData() {

		Student s = new Student();

		System.out.println("Enter RollNumber For Delete StudentData");
		s.setRollno(sc.nextInt());

		session.remove(s);

		session.beginTransaction().commit();

		return "Data Delete Successfully";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TestStudent t = new TestStudent();

		while (true) {

			System.out.println("\n1.addStudentData" + " \n2.readStudentData " + "\n3.updateStudentData"
					+ " \n4.deleteStudentData" + " \n5.getAllStudentData " + "\n6.Exit ");

			System.out.println("Enter Your Choice: ");
			int n = sc.nextInt();

			switch (n) {

			case 1:
				t.addStudentData();
				break;

			case 2:
				t.readStudentData();
				break;

			case 3:
				t.updateStudentData();
				break;

			case 4:
				String msg = t.deleteStudentData();
				System.out.println(msg);
				break;

			case 5:
				List<Student> list = t.getAllStudentData();
				System.out.println(list);
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Enter Valid Choice");
			}

		}

	}
}
