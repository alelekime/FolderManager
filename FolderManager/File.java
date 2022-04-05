
public class File{
	private String name;
	private String ext;
	private String type;
	private int size;
	private static int index = 0;// variavel que altera o índice do vetor de extensao 
	
	//Vetores com as imformacoes dos arquivos 
	
	String exts[] = {".txt", ".jpg", ".pdf"};
	
	String types[] = {"txt", "img", "pdf"};
	
	String names[][] = { 	{"Frankenstein", "Pride and Prejudice", "Alice's Adventures in Wonderland"}, 
							{"Eagle Nebula", "Lunch Atop a Skyscraper", "V-J Day in Times Square"},
							{"CI1062-Paradigmas-de-Programação-Ficha1"}	}; //txt files
	
	int sizes[][] = {		{438, 781, 171},
							{2256, 7212, 13776},
							{102}};//books sizes in kbs
	
	
	
	
	public void FileFill (int i, int j) { // Chama os metodos de set(name, type, ext e size)
		setExt(exts[index+i]);
		setName(names[i][j]);
		setSize(sizes[i][j]);
		setType(types[index+i]);
		
	}
	
	//Setters e Getters
	 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}


	
	
	
}
