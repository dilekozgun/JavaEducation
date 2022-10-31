package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();

	void addLanguage(ProgrammingLanguage language) throws Exception;

	void deleteLanguage(ProgrammingLanguage language) throws Exception;

	void updateLanguage(ProgrammingLanguage newLanguage) throws Exception;

	ProgrammingLanguage getProgrammingLanguageById(int id);

}
