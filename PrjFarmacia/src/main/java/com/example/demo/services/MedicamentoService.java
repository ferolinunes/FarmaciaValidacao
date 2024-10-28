package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Medicamento;
import com.example.demo.repositories.MedicamentoRepository;

@Service
public class MedicamentoService {
	private final MedicamentoRepository medicamentorepository;

	@Autowired
	public MedicamentoService(MedicamentoRepository medicamentorepository) {
		this.medicamentorepository = medicamentorepository;
	}

	public Medicamento salvarMedicamento(Medicamento medicamento) {
		return medicamentorepository.save(medicamento);
	}

	public Medicamento buscarMedicamentoPorId(Long id) {
		return medicamentorepository.findById(id).orElse(null);
	}

	public List<Medicamento> buscarTodosUsuarios() {
		return medicamentorepository.findAll();
	}

	public void excluirMedicamento(Long id) {
		medicamentorepository.deleteById(id);
	}

	public Medicamento atualizarMedicamento(Long id, Medicamento medicamentoatualizado) {
		Optional<Medicamento> medicamentoexistente = medicamentorepository.findById(id);
		if (medicamentoexistente.isPresent()) {
			Medicamento medicamento = medicamentoexistente.get();
			medicamento.setNome(medicamentoatualizado.getNome());
			medicamento.setBula(medicamentoatualizado.getBula());
			medicamento.setIdFornecedor(medicamentoatualizado.getIdFornecedor());
			medicamento.setDataValidade(medicamentoatualizado.getDataValidade());
			return medicamentorepository.save(medicamento);
		} else
			return null;
	}

	

}

