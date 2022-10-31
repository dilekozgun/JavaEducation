package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService languageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {
		this.languageService = languageService;
	}

	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll() {
		return languageService.getAll();
	}

	@PostMapping("/add")
	public void addLanguage(ProgrammingLanguage language) throws Exception {
		languageService.addLanguage(language);
	}

	@DeleteMapping("/delete")
	void deleteLanguage(ProgrammingLanguage language) throws Exception {
		languageService.deleteLanguage(language);
	}

	@PutMapping("/update")
	void updateLanguage(ProgrammingLanguage newLanguage) throws Exception {
		languageService.updateLanguage(newLanguage);
	}

	@GetMapping("/getById")
	ProgrammingLanguage getProgrammingLanguageById(int id) {
		return languageService.getProgrammingLanguageById(id);
	}

}
