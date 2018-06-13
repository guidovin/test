package br.com.fes.relatorios.bean;

import br.com.fes.relatorios.dao.*;
import br.com.fes.relatorios.domain.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;


@ManagedBean(name = "MBAlunos")
@ViewScoped
public class AlunosBean {
	
	private Dados dadosRegistro = new Dados();

	public Dados getDadosRegistro() {
		return dadosRegistro;
	}

	public void setDadosRegistro(Dados dadosRegistro) {
		this.dadosRegistro = dadosRegistro;
	}

	public void consultar(){
		try {
			DadosDAO dao = new DadosDAO();
			dao.consultar(dadosRegistro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
