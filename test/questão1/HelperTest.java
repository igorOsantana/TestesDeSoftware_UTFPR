package questão1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class HelperTest {

	@Test
	void listaNula() throws Exception {
		
		var helper = new Helper();
		
		assertThrows(Exception.class, ()-> {
			helper.gerarMensagens(null);
		});
	}
	
	@Test
	void listaVaziaDeAlunos() throws Exception {
		
		var helper = new Helper();
		
		ArrayList<Aluno> vetorVazio = new ArrayList<Aluno>();
		
		
		assertThrows(Exception.class, ()-> {
			helper.gerarMensagens(vetorVazio);
		});	
	} 
	
	@Test
	void listaComNomeInvalido() throws Exception {
		
		var helper = new Helper();
		
		ArrayList<Aluno> nomeInvalido = new ArrayList<Aluno>();
		
		var igor = new Aluno("", 10);
		
		nomeInvalido.add(igor);
		
		assertThrows(Exception.class, ()-> {
			helper.gerarMensagens(nomeInvalido);
		});
	} 
	
	@Test
	void listaComNotaInvalida() throws Exception {
		
		var helper = new Helper();
		
		ArrayList<Aluno> notaInvalida = new ArrayList<Aluno>();
		
		var igor = new Aluno("Igor", 11);
		
		notaInvalida.add(igor);
		
		assertThrows(Exception.class, ()-> {
			helper.gerarMensagens(notaInvalida);
		});	
	} 
	
	@Test
	void notaExcelente() throws Exception {
		
		var helper = new Helper();
		
		var notaExcelente = new ArrayList<Aluno>();
		
		var igor = new Aluno("Igor", 10);
		
		notaExcelente.add(igor);
		
		helper.gerarMensagens(notaExcelente);
		
		assertEquals("excelente", igor.getMensagem());
	}
	
	@Test
	void notaBom() throws Exception {
		
		var helper = new Helper();
		
		var notaBom = new ArrayList<Aluno>();
		
		var igor = new Aluno("Igor", 7);
		
		notaBom.add(igor);
		
		helper.gerarMensagens(notaBom);
		
		assertEquals("bom", igor.getMensagem());
	} 
	
	@Test
	void notaRegular() throws Exception {
		
		var helper = new Helper();
		
		var notaRegular = new ArrayList<Aluno>();
		
		var igor = new Aluno("Igor", 5);
		
		notaRegular.add(igor);
		
		helper.gerarMensagens(notaRegular);
		
		assertEquals("regular", igor.getMensagem());
	}
	
	@Test
	void notaReprovado() throws Exception {
		
		var helper = new Helper();
		
		var notaReprovado = new ArrayList<Aluno>();
		
		var igor = new Aluno("Igor", 0);
		
		notaReprovado.add(igor);
		
		helper.gerarMensagens(notaReprovado);
		
		assertEquals("reprovado", igor.getMensagem());
	} 
}
