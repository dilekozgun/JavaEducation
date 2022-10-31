package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> languages;

	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<>();
		languages.add(new ProgrammingLanguage(1,"Java"));
		languages.add(new ProgrammingLanguage(2,"Pyhton"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public void addLanguage(ProgrammingLanguage newLanguage) {
		languages.add(newLanguage);
	}

	@Override
	public void deleteLanguage(ProgrammingLanguage language) {
		languages.remove(languages.indexOf(language));
	}

	@Override
	public void updateLanguage(ProgrammingLanguage newLanguage) {
		ProgrammingLanguage language = getLanguageById(newLanguage.getId());
		language.setName(newLanguage.getName());
	}

	@Override
	public ProgrammingLanguage getLanguageById(int id) {
		for (ProgrammingLanguage lang : languages) {
			if (lang.getId() == id) {
				return lang;
			}
		}
		return null;

	}

}
