package kodlama.io.kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;


import kodlama.io.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
public interface ProgrammingLanguageRepository {
	public List<ProgrammingLanguage> getAll();
	
	public ProgrammingLanguage getById(int id);

	public void add(ProgrammingLanguage language) throws Exception;

	public void delete(int id);

	public void update(int id, String name);
}
