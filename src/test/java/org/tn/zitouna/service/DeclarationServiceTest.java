package org.tn.zitouna.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.tn.zitouna.dao.DeclarationRepository;
import org.tn.zitouna.entities.Declaration;
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class DeclarationServiceTest {
	@Mock
	DeclarationRepository declarationRepository;
	@InjectMocks
	DeclarationService declarationService;
	Declaration declaration = new Declaration();
	
	@BeforeEach
	void setUp() throws Exception {
		declaration.setId("7");
	}


	@Test
	void testGetAll() {
		when(declarationRepository.findAll()).thenReturn(null);
		assertEquals(null, declarationService.getAll());
	}

	@Test
	void testGetOne() {
		Mockito.when(declarationRepository.findById(declaration.getId())).thenReturn(Optional.of(declaration));
		assertEquals(declaration,declarationService.getOne(declaration.getId()));
	}

	@Test
	void testAdd() {
		when(declarationRepository.save(ArgumentMatchers.any(Declaration.class))).thenReturn(declaration);
		assertNotEquals(declarationService.add(declaration), declaration);
		
	}

	@Test
	void testUpdate() {
		declaration.setDomaine("test");
		when(declarationRepository.findById(declaration.getId())).thenReturn(Optional.of(declaration));
		declarationService.update(declaration);
		assertEquals("test", declaration.getDomaine());
		
	}

	@Test
	void testDelete() {
		//when(declarationRepository.deleteById(declaration.getId())).then(Optional.of(declaration));
		//declarationService.delete(declaration.getId());
		verify(declarationRepository,times(0)).deleteById(declaration.getId());
	}

}
