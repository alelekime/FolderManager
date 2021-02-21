import java.util.List;

public class Folder{
	String name;
	private static int index = 0; // variável que altera o índice do vetor de nome
	
	List<Folder> folders;
	List<File> files;
	
	//Vetores com a imformação da pasta
	
	String names[] = {"FolderTxt", "FolderJpg", "FolderPdf"};
	
	public void FillFolder() { // Chama a funcão de setName
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
