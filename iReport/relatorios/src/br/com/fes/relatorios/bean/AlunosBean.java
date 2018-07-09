package br.com.fes.relatorios.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;

import br.com.fes.relatorios.dao.DadosDAO;
import br.com.fes.relatorios.domain.Dados;


@ManagedBean(name = "MBAlunos")
@ViewScoped
public class AlunosBean {
	
	private Dados dadosRegistro = new Dados();

	public Dados getDadosRegistro() {
		if(dadosRegistro == null){
			dadosRegistro = new Dados();
		}
		return dadosRegistro;
	}

	public void setDadosRegistro(Dados dadosRegistro) {
		this.dadosRegistro = dadosRegistro;
	}

		
	public void consultar(){
		try {
			DadosDAO dao = new DadosDAO();
			System.out.println("matricula " + dadosRegistro.getMatrícula());
			dao.consultar(dadosRegistro);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
