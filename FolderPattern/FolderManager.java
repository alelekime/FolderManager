
public class FolderManager {

	public static void main(String[] args) {
		
		DataFactory dataFactory = new DataFactory();
		
		Visitor v = new DataVisitor();
		Data FolderList = dataFactory.createData("Folder", 0, 0);
		
		for (int i = 0; i < 3; i++) {
			Data Folder = dataFactory.createData("Folder", 0,0);
			((DataFolder) FolderList).addData(Folder);
			for (int j = 0; j < 3; j++) { //Faz o looping para preencher os 7 arquivos
				//System.out.println(i +" "+ j);
				Data File = dataFactory.createData("File", i,j);// Cria um file e preenche o nome, size, type e ext do file com strings do vetor names, sizes types e ext na classe file
				((DataFolder) Folder).addData(File);//Adiciona o file ao Array
				//Folder.accept(v);
				if (i == 2)	break;// Como existe somente 1 arquivo com ext de pdf, ao chegar na ultima pasta, esse if quebra o for
			}
			
		}
		System.out.println("Folder and Files: ");
		FolderList.acceptAll(v);

		System.out.println();
		System.out.println("Text: ");
		FolderList.acceptType(v);

	}

}
