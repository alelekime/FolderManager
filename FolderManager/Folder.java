import java.util.List;

public class Folder{
	String name;
	private static int index = 0; // variavel que altera o indice do vetor de nome
	
	List<Folder> folders;
	List<File> files;
	
	//Vetores com a informacao da pasta
	
	String names[] = {"FolderTxt", "FolderImg", "FolderPdf"};
	
	public void FillFolder() { // Chama a funcao de setName
		setName(names[index]);
		index++;
	}
	
	//Setters e Getters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

	
}
