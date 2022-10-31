package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();

	void addLanguage(ProgrammingLanguage language);

	void deleteLanguage(ProgrammingLanguage language);

	void updateLanguage(ProgrammingLanguage newLanguage);

	ProgrammingLanguage getLanguageById(int id);

}
