package persistance;

import java.util.ArrayList;
import java.util.List;

import data.Cat;
import data.FelineInterface;

public class FelineRepository implements FelineRepositoryInterface {

	private List<FelineInterface> felines;
	private List<FelineInterface> duplicateFelines = new ArrayList<>();

	public FelineRepository() {
		felines = new ArrayList<>();
	}

	@Override
	public boolean save(FelineInterface feline) {
		return false;
	}

	@Override
	public boolean delete(FelineInterface feline) {
		return false;
	}

	@Override
	public boolean update(FelineInterface feline) {
		for (FelineInterface f : felines) {
			if (feline.getId() == f.getId()) {
				felines.set(felines.indexOf(feline), feline);
			}
			return true;
		}
		return false;
	}

	@Override
	public List<FelineInterface> findAll() {
		for (FelineInterface f : felines) {
			duplicateFelines.add(((Cat) f).clone());
		}
		return duplicateFelines;
	}

	@Override
	public FelineInterface findById(Integer id) {
		for (FelineInterface f : felines) {
			if (f.getId() == id) {
				return ((Cat) f).clone();
			}
		}
		return null;
	}

	@Override
	public FelineInterface findByName(String name) {
		for (FelineInterface f : felines) {
			if (f.getName().equals(name)) {
				return ((Cat) f).clone();
			}
		}
		return null;
	}

	@Override
	public FelineInterface findByRace(String race) {
		for (FelineInterface f : felines) {
			if (f.getRace().equals(race)) {
				return ((Cat) f).clone();
			}
		}
		return null;
	}

	// For testing
	// Fill the list with data
	public void generate() {
		felines.add(new Cat(1, "Bars", "Scottish", 2019));
		felines.add(new Cat(2, "Mars", "British", 2018));
		felines.add(new Cat(3, "Pars", "Persian", 2017));
	}

}