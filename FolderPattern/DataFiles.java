
public class DataFiles implements Data{

	private String nameOfData;
	private String extOfData;
	private String typeOfData;
	private int sizeOfData;
	

	private static int index = 0;
	
	
	//Vetores com as imformacoes dos arquivos 
	
	String exts[] = {".txt", ".jpg", ".pdf"};
	
	String types[] = {"txt", "img", "pdf"};
	
	String names[][] = { 	{"Frankenstein", "Pride and Prejudice", "Alice's Adventures in Wonderland"}, 
							{"Eagle Nebula", "Lunch Atop a Skyscraper", "V-J Day in Times Square"},
							{"CI1062-Paradigmas-de-Programacao-Ficha1"}	}; //txt files
	
	int sizes[][] = {		{438, 781, 171},
							{2256, 7212, 13776},
							{102}};//books sizes in kbs
	
	 public DataFiles(int i, int j) {
		setNameOfData(names[index + i][j]);
		setExtOfData(exts[index+i]);
		setSizeOfData(sizes[i][j]);
		setTypeOfData(types[index+i]);
		//index++;
	}
	 
	@Override
	public String getNomeOfData() {
		return this.nameOfData;
	}

	@Override
	public void printNameOfData() {
		System.out.println(getNomeOfData());
		
	}

	public void setNameOfData(String nameOfData) {
		this.nameOfData = nameOfData;
	}
	public String getExtOfData() {
		return extOfData;
	}
	public void setExtOfData(String extOfData) {
		this.extOfData = extOfData;
	}
	public String getTypeOfData() {
		return typeOfData;
	}
	public void setTypeOfData(String typeOfData) {
		this.typeOfData = typeOfData;
	}
	public int getSizeOfData() {
		return sizeOfData;
	}
	public void setSizeOfData(int sizeOfData) {
		this.sizeOfData = sizeOfData;
	}

	@Override
	public void acceptAll(Visitor v) {
		v.visit(this);
		
	}

	@Override
	public void acceptType(Visitor v) {
		v.visit(this, "txt");
		
	}


}
