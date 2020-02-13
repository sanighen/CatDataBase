package persistance;

import java.util.List;

import data.FelineInterface;

public interface FelineRepositoryInterface {

	boolean save(FelineInterface feline);

	boolean delete(FelineInterface feline);

	boolean update(FelineInterface feline); 

	List<FelineInterface> findAll(); 
	
	FelineInterface findById(Integer id); 
	
	FelineInterface findByName(String name);
	
	FelineInterface findByRace(String race);

}