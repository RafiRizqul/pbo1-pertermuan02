import koneksi.database;
import model.dosen;
import model.mahasiswa;
import model.matakuliah;

public class main{
	public static void main(String [] args){
		System.out.println("ini program main");
		database.hubungkan();
		Dosen.tampilaninfo();
		mahasiswa.tampilaninfo();
		matakuliah.tampilaninfo();
	}
}