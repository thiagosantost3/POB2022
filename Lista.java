package crudAlunos;

import java.util.ArrayList;

public class Lista {
	private ArrayList<Aluno> alunos = new ArrayList<>();
	
	public Lista(){
	}
	
	public void exibeLista() {
		for (int i=0;i< alunos.size();i++) {
			Aluno al = alunos.get(i);
			System.out.println("nome:"+ al.getNome()+" matricula:"+ al.getMatricula());
		}
	}
	public int existeNaLista(String mat) {
		Aluno al;
		for(int i=0;i< alunos.size();i++) {
			al = alunos.get(i);
			if(al.getMatricula().equals(mat)) {
				return i;
			}
		}
		
		return -1;
	}
	public int inseriAluno(String nome, String mat) {
		Aluno al = new Aluno(nome , mat);
		//nao ta na lista
		if(existeNaLista(mat) == -1){
			alunos.add(al);
			return 1;
		}
		return 0;
	}
	
	public int excluiAluno(String mat) {
		int pos = existeNaLista(mat);
		//está na lista
		if(pos != -1) {
			alunos.remove(pos);
			return 1;
		}
		return 0;
	}
	public int atualizaAluno(String nome, String mat) {
		int pos = existeNaLista(mat);
		Aluno al = new Aluno(nome, mat);
		if(pos != -1) {
			alunos.set(pos, al);
			return 1;
		}
		return 0;
	}
}
