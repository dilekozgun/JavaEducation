package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository languageRepository;
	List<ProgrammingLanguage> languages;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
		this.languages= getAll();
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public void addLanguage(ProgrammingLanguage language) throws Exception {
		if (checkNameIsEmpty(language.getName())) {
			throw new Exception("Dil adı boş geçilemez.");
		}
		if (!languages.isEmpty()) {
			for (ProgrammingLanguage lang : languages) {
				if (lang.getId() == language.getId()) {
					throw new Exception("Aynı id ile bir kayıt bulunmaktadır.");
				}
				if (lang.getName().trim().equalsIgnoreCase(language.getName().trim())) {
					throw new Exception("Aynı isim ile bir kayıt bulunmaktadır.");
				}
			}

		}

		languageRepository.addLanguage(language); 
	}

	@Override
	public void deleteLanguage(ProgrammingLanguage language) throws Exception {
		if (getProgrammingLanguageById(language.getId()) == null) {
			throw new Exception("Silinmek istenen dil bulunamadı.");
		}
		languageRepository.deleteLanguage(language);
	}

	@Override
	public void updateLanguage(ProgrammingLanguage newLanguage) throws Exception {
		if (checkNameIsEmpty(newLanguage.getName())) {
			throw new Exception("Dil adı boş geçilemez.");
		}
		if (getProgrammingLanguageById(newLanguage.getId()) == null) {
			throw new Exception("Güncellenmek istenen dil bulunamadı.");
		}
		for (ProgrammingLanguage lang : languages) {
			if (lang.getName().trim().equalsIgnoreCase(newLanguage.getName().trim()))
				throw new Exception("Aynı isim ile bir kayıt bulunmaktadır.");
		}
		languageRepository.updateLanguage(newLanguage);
	}

	@Override
	public ProgrammingLanguage getProgrammingLanguageById(int id) {
		return languageRepository.getLanguageById(id);
	}

	private boolean checkNameIsEmpty(String name) {
		return name == null || name.trim().isEmpty();
	}

}
