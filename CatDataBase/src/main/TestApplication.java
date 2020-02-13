package main;

import java.util.ArrayList;
import java.util.List;

import data.Cat;
import data.FelineInterface;
import persistance.FelineRepository;
import persistance.FelineRepositoryInterface;

public class TestApplication {

	public static void main(String[] args) {

		FelineRepositoryInterface fr = new FelineRepository();

		((FelineRepository) fr).generate();

//		 System.out.println(fr.findById(1));



//		FelineInterface cat = fr.findByName("������");

//		for (FelineInterface f : fr.findAll()) {
//			if (f.getName() == "������") {
//				System.out.println(f);
//			}
//		}
		

		Cat cat = (Cat) fr.findById(1);
		cat.setName("Masya");
		fr.update(cat);
		
		
		for (FelineInterface f : fr.findAll()) {
				System.out.println(f);
		}

	}

}