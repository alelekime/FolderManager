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
		
		
		for (int i = 1; i < 4; i++) {//Comeca em 1, pois a primeira posicao é o folderMain
			Folder folder= new Folder();// Cria um folder 
			folderMain.folders.add(folder);//Adiciona o folder ao Array
			folderMain.folders.get(i).FillFolder();// Preenche o nome do Folder com strings do vetor names na classe folder
			for (int j = 0; j < 3; j++) { //Faz o looping para preencher os 7 arquivos
				File file = new File();// Cria um file
				folderMain.files.add(file);//Adiciona o file ao Array
				folderMain.files.get(index).FileFill(i-1, j);// Preenche o nome, size, type e ext do file com strings do vetor names, sizes types e ext na classe file
				index++;//Altera a posicao do Array de files para adicionar o proximo 
				if (i == 3)	break;// Como existe somente 1 arquivo com ext de pdf, ao chegar na ultima pasta, esse if quebra o for
			}
		}
		
		
		printAll(folderMain.files, folderMain.folders);// Chama o metodo para imprimir na tela os nomes de todos os arquivos e pastas 
		printType(folderMain,folderMain.files, folderMain.folders, "txt");// Chama o metodo para imprimir na tela os nomes dos arquivos do tipo escolhido: txt, pdf ou img 
	}
	
	
	
	public static void printAll(List<File> files,List<Folder> folders) {
		int index = 0; //indice para percorrer o Array de files 
		System.out.println("O nome de todas as pastas e arquivos: \n");
		System.out.println("Name Folder: " + folders.get(0).getName());// Imprime o nome do folderMain
		for (int i = 1; i < folders.size(); i++) {// Vai percorrer o número de objetos do Array folder 
			System.out.println("	Name Folder: " + folders.get(i).getName());// Imprime o nome do folder 
			for (int j = 0; j < 3; j++) {// Faz o looping de impressao dos 7 arquivos 
				System.out.println("		Name : " + files.get(index).getName() +files.get(index).getExt() +"\n"+ "		Type: "+ files.get(index).getType() +"\n"+ "		Size: "+files.get(index).getSize() + " kb");//Impreime nome.ext, type e size formatados
				if (i == 3)	break; //Como existe somente 1 arquivo com ext de pdf, ao chegar na ultima pasta, esse if quebra o for
				index++;//Altera a posicao do Array de files para imprimir o próximo
			}
			System.out.println();//Pula linha 
		}
		
	}
	
	public static void printType(Folder folderMain,List<File> files,List<Folder> folders, String type) {
		int index = 0; //indice para percorrer o Array de files 
		System.out.println("Todos os arquivos de tipo "+type + ": \n");
		System.out.println("Text Files: " + "."+ type);// Imprime o nome da pasta de texto 
		for (int j = 0; j < files.size(); j++) {// Percorre to do Array procurando 
			if (files.get(index).getType().equals(type)) {// Se o objeto tiver a extensao .txt, imprime na tela 
				System.out.println("	" + files.get(index).getName() + files.get(index).getExt());// Imprime nome do file 
			}
			index++;//Altera a posicao do Array de files para adicionar o próximo
		}
	}

}
