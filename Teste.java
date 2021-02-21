import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		int index = 0; // indice do Array de files
		
		Folder folderMain = new Folder(); //Cria a pasta principal
		folderMain.setName("Desktop");// Nomeia a pasta principal
		folderMain.files = new ArrayList<>(); //Cria o Array de todos os arquivos 
		folderMain.folders = new ArrayList<>();//Cria o Array de todas as pastas
		folderMain.folders.add(folderMain); //Adiciona a pasta principal ao Array
		
		
		for (int i = 1; i < 4; i++) {//Começa em 1, pois a primeira posição é o folderMain
			Folder folder= new Folder();// Cria um folder 
			folderMain.folders.add(folder);//Adiciona o folder ao Array
			folderMain.folders.get(i).FillFolder();// Preenche o nome do Folder com strings do vetor names na classe folder
			for (int j = 0; j < 3; j++) { //Faz o looping para preencher os 7 arquivos
				File file = new File();// Cria um file
				folderMain.files.add(file);//Adiciona o file ao Array
				folderMain.files.get(index).FileFill(i-1, j);// Preenche o nome, size, type e ext do file com strings do vetor names, sizes types e ext na classe file
				index++;//Altera a posição do Array de files para adicionar o próximo 
				if (i == 3)	break;// Como existe somente 1 arquivo com ext de pdf, ao chegar na ultima pasta, esse if quebra o for
			}
		}
		
		
		printAll(folderMain.files, folderMain.folders);// Chama o método para imprimir na tela os nomes de todos os arquivos e pastas 
		printText(folderMain,folderMain.files, folderMain.folders);// Chama o método para imprimir na tela os nomes dos arquivos do tipo texto
	}
	
	
	
	public static void printAll(List<File> files,List<Folder> folders) {
		int index = 0; //índice para percorrer o Array de files 
		System.out.println("O nome de todas as pastas e arquivos: \n");
		System.out.println("Name Folder: " + folders.get(0).getName());// Imprime o nome do folderMain
		for (int i = 1; i < folders.size(); i++) {// Vai percorrer o número de objetos do Array folder 
			System.out.println("	Name Folder: " + folders.get(i).getName());// Imprime o nome do folder 
			for (int j = 0; j < 3; j++) {// Faz o looping de impressão dos 7 arquivos 
				System.out.println("		Name : " + files.get(index).getName() +files.get(index).getExt() +"\n"+ "		Type: "+ files.get(index).getType() +"\n"+ "		Size: "+files.get(index).getSize() + " kb");//Impreime nome.ext, type e size formatados
				if (i == 3)	break; //Como existe somente 1 arquivo com ext de pdf, ao chegar na ultima pasta, esse if quebra o for
				index++;//Altera a posição do Array de files para imprimir o próximo
			}
			System.out.println();//Pula linha 
		}
		
	}
	
	public static void printText(Folder folderMain,List<File> files,List<Folder> folders) {
		int index = 0; //índice para percorrer o Array de files 
		System.out.println("Todos os arquivos de tipo texto: \n");
		System.out.println("Text FIles: " + folderMain.files.get(0).exts[0]);// Imprime o nome da pasta de texto 
		for (int j = 0; j < files.size(); j++) {// Percorre to do Array procurando 
			if (files.get(index).getExt().equals(folderMain.files.get(0).exts[0])) {// Se o objeto tiver a extensão .txt, imprime na tela 
				System.out.println("	" + files.get(index).getName());// Imprime nome do file 
			}
			index++;//Altera a posição do Array de files para adicionar o próximo
		}
	}

}
